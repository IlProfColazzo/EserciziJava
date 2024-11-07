public class Modello {
    private String nome;
    private double costoFisso;
    private double numMateriale;

    public Modello(String nome, double costoFisso, double numMateriale) {
        this.nome = nome;
        this.costoFisso = costoFisso;
        this.numMateriale = numMateriale;
    }

    public double getCostoFisso() {
        return this.costoFisso;
    }
    public double getNumMateriale(){
        return numMateriale;
    }
    public String toString() {
        return nome;
    }

    
}
