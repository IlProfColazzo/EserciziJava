public class Quadro extends Opera{
    private String pittura;
    private int base;
    private int altezza;

    public Quadro(String nome, String nomeArtista, int anno, double valore,String pittura, int base, int altezza) {
       super(nome,nomeArtista,anno,valore);
        this.pittura = pittura;
        this.base = base;
        this.altezza = altezza;
    }

    
}
