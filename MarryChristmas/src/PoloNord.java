import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class PoloNord {

    private TreeMap<String,Bambino> bambini;
    private HashMap<String,Regalo> regali;
    private HashMap<String,Slitta> slitte;

    public PoloNord() {
        this.bambini = new TreeMap<>();
        this.regali = new HashMap<>();
        this.slitte = new HashMap<>();
    }

    public boolean aggiungiBambino(String codice, String nome, String indirizzo, int nRegali){
        if(this.bambini.containsKey(codice))
            return false;
        this.bambini.put(codice,new Bambino(codice,nome,indirizzo,nRegali));
        return true;
    }

    public Bambino getBambino(String codice){
        return this.bambini.get(codice);
    }

    public boolean aggiungiRegalo(String codice, String descrizione, double peso){
        if(this.regali.containsKey(codice))
            return false;
        this.regali.put(codice,new Regalo(codice, descrizione, peso));
        return true;
    }

    public boolean assegnaRegalo(String codiceBambino, String codiceRegalo){
        if(!this.bambini.containsKey(codiceBambino))
            return false;
        if(!this.regali.containsKey(codiceRegalo))
            return false;
        Bambino b = this.bambini.get(codiceBambino);
        Regalo r = this.regali.get(codiceRegalo);
        if(r.getDestinatario()!=null)
            return false;
        if(!b.hasSpace())
            return false;
        
        r.setDestinatario(b);
        b.addRegalo(r);
        return true;

    }

    public String getRichieste(){
        String retValue="";
        for (Bambino b : this.bambini.values()) {
            retValue+=b+"\n";
        }
        return retValue;
    }

    public void caricaDati(String path){
        try {
			File myObj = new File(path);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
                String [] splittedString = data.split(";");
                if(splittedString[0].equals("B")){
                    aggiungiBambino(splittedString[1], splittedString[
                    2], splittedString[
                    3], Integer.parseInt(splittedString[4]));
                } 
                else if(splittedString[0].equals("R")){
                    aggiungiRegalo(splittedString[1], splittedString[2], Double.parseDouble(splittedString[3]));
                }
                else if(splittedString[0].equals("A")){
                    assegnaRegalo(splittedString[1], splittedString[2]);
                }
				
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
    }

    public boolean aggiungiSlitta(String codice, int nRenne, double caricoMassimo){
        if(!this.slitte.containsKey(codice)){
            Slitta s = new Slitta(codice, nRenne, caricoMassimo);
            this.slitte.put(codice, s);
            return true;
        }
        return false;

    }

    public double caricaSlitta(String codice){
        Slitta s = this.slitte.get(codice);

        for (Bambino b : this.bambini.values()) {
            if(s.getPesoAttuale()+b.getPesoTot()<s.getPesoMassimo()&&!b.isSoddisfatto()){
                s.incrementa(b.getPesoTot());
                b.setSoddisfatto();
                s.caricaRegali(b.getRegali());
                
            }
        }
        
        return s.getPesoMassimo()-s.getPesoAttuale();
    }
    
}
