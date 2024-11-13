public class Libro {
    private String titolo;
    private String autore;

    private Ripiano posizione;
    
    public Libro(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
    }

    public String getAutore() {
        return autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setPosizione(Ripiano posizione) {
        this.posizione = posizione;
    }

    @Override
    public String toString() {
        return this.autore + ", " + this.titolo;
    }


    public int getRipiano(){
        return posizione.getCodice();
    }

    public String getScaffale(){
        return posizione.getScaffale().getCodice();
    }

    public int getPiano(){
        return posizione.getScaffale().getPiano().getCodice();
    }
    
    
}
