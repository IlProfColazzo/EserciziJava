public class Ripiano {

    private Libro libri[];
    private Scaffale scaffale;
    private int nLibri;
    private int codice;
    
    public Ripiano(Scaffale scaffale, int codice) {
        this.scaffale = scaffale;
        this.libri = new Libro[10];
        this.nLibri = 0;
        this.codice = codice;
    }

    public boolean addLibro(Libro l){
        if(this.nLibri<libri.length){
            this.libri[this.nLibri] = l;
            this.nLibri++;
            return true;
        }
        return false;
    }

    public boolean contiene(){
        return this.nLibri > 0;
    }
    
    @Override
    public String toString() {
        String retValue = "";
        for (Libro libro : libri) {
            retValue += libro + "\n";
        }
        return retValue;
    }

    public int getCodice() {
        return codice;
    }

    public Scaffale getScaffale() {
        return scaffale;
    }
    

    

    
}
