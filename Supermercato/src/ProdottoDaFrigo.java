public class ProdottoDaFrigo extends Prodotto{
    private double temperatura;

    public ProdottoDaFrigo(String nome, String codice, double volume){
        super(nome, codice, volume);
    }

    public boolean isDaFrigo(){
        return true;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}
