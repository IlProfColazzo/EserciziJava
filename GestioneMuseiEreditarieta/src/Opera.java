public abstract class Opera {
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
    
    //_nomeArtista-nomeOpera-anno_

    @Override
    public String toString() {
        return nomeArtista+"-"+nome+"-"+anno;
    }
}
