public class Prodotto {
    private String nome;
    private String codice;
    private double volume;
    private double prezzo;
    private double sconto;

    public Prodotto(String nome, String codice, double volume) {
        this.nome = nome;
        this.codice = codice;
        this.volume = volume;
    }

    public String getNome() {
        return nome;
    }

    public String getCodice() {
        return codice;
    }

    public double getVolume() {
        return volume;
    }

    

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setSconto(double sconto) {
        this.sconto = sconto;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public double getSconto() {
        return sconto;
    }

    public boolean isDaFrigo(){
        return false;

    }

    



    

    
}
