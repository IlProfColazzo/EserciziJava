import java.util.HashMap;

public class Bambino {
    private String codice;
    private String nome;
    private String indirizzo;
    private int nregali;
    private boolean isSoddisfatto;
    private HashMap<String,Regalo> regali;

    public Bambino(String codice, String nome, String indirizzo, int nregali) {
        this.codice = codice;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.nregali = nregali;
        this.regali = new HashMap<>();
        isSoddisfatto=false;

    }

    public boolean hasSpace(){
        return this.nregali>regali.size();
    }

    public void addRegalo(Regalo r){
        this.regali.put(r.getCodice(), r);
    }

    @Override
    public String toString() {
        String retValue = "Regali di " + nome +":";
        for (Regalo r : this.regali.values()) {
            retValue+=r + ", ";
        }
        return retValue.substring(0, retValue.lastIndexOf(", "));
    }

    public double getPesoTot(){
        double peso=0.0;
        for (Regalo r : this.regali.values()) {
            peso+=r.getPeso();
        }
        return peso;
    }
    public void setSoddisfatto(){
        this.isSoddisfatto = true;
    }

    public HashMap<String, Regalo> getRegali() {
        return this.regali;
    }
    public boolean isSoddisfatto(){
        return this.isSoddisfatto;
    }
    
}
