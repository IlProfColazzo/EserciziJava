import java.util.HashMap;
public class Medico {
    private String nome;
    private String cognome;
    private String cf;
    private String matricola;
    private HashMap<String, Paziente>listaPazienti;
    
    
    public Medico(String nome, String cognome, String cf, String matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.cf = cf;
        this.matricola = matricola;
        this.listaPazienti= new HashMap<>();
    }


    public String getPazienti(){
        String retValue = "\"";
        for (Paziente p : listaPazienti.values()) {
            retValue+=p+"\n";

        }
        return retValue+"\"";
    }



    public void addPaziente(Paziente p){
        listaPazienti.put(p.getCf(), p);
    }

    public String getCf() {
        return cf;
    }
    
    public String getMatricola() {
        return matricola;
    }

}
