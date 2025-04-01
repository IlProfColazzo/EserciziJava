public class Statua extends Opera{
    private String materiale;
    private double peso;

    public Statua(String nome, String nomeArtista, int anno, double valore,String materiale, double peso) {
       super(nome,nomeArtista,anno,valore);
        this.materiale=materiale;
        this.peso=peso;
    }
}
