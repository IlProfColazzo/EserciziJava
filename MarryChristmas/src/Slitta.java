import java.util.HashMap;

public class Slitta {

    private String codice;
    private int nRenne;
    private double pesoMassimo;
    private double pesoAttuale;
    private HashMap<String,Regalo> regaliCaricati;

    public Slitta(String codice, int nRenne, double pesoMassimo) {
        this.codice = codice;
        this.nRenne = nRenne;
        this.pesoMassimo = pesoMassimo;
        this.regaliCaricati = new HashMap<>();
        this.pesoAttuale = 0.0;
    }

    public double getPesoMassimo() {
        return this.pesoMassimo;
    }

    public void caricaRegali(HashMap<String,Regalo> r){
        this.regaliCaricati.putAll(r);
    }
    public double getPesoAttuale() {
        return this.pesoAttuale;
    }
    public void incrementa(double peso){
        this.pesoAttuale+=peso;
    }

    
}
