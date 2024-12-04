
public class Opera {
    private String nome;
    private String nomeArtista;
    private int anno;
    private double valore;

    public Opera(String nome, String nomeArtista, int anno, double valore) {
        this.nome = nome;
        this.nomeArtista = nomeArtista;
        this.anno = anno;
        this.valore = valore;
    }

    public String toString(){
        return nomeArtista + "-" + nome + "-" + anno;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

   
    

    
}
