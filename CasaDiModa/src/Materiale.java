public class Materiale {
    private String nome;
    private double prezzo;

    public Materiale(String nome, double prezzo){
        this.nome = nome;
        this.prezzo=prezzo;
    }
    public double getPrezzo() {
        return prezzo;
    }
    
    public String toString() {
        return nome;
    }
}
