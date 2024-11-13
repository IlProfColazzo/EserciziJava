public class Scaffale{

    private String codice;
    private Ripiano ripiani[];
    private Piano piano;
    
    public Scaffale(String codice, Piano piano) {
        this.codice = codice;
        this.ripiani = new Ripiano[6];
        for (int i = 0; i < ripiani.length; i++) {
            this.ripiani[i] = new Ripiano(this,i);
        }
        this.piano = piano;
    }

    public boolean addLibro(Libro l, int ripiano){
        if(ripiano<ripiani.length){
            return this.ripiani[ripiano].addLibro(l);
        }
        return false;
    }

    public boolean contiene(int ripiano){
        if(ripiano<ripiani.length){
            return this.ripiani[ripiano].contiene();
        }
        return false;
    }

    public String getLibri(){
        String retValue = "";
        for (int i = 0; i < ripiani.length; i++) {
            retValue += "Ripiano " + (i+1);
            retValue +=ripiani[i].toString();
        }
        return retValue;
    }

    public String getCodice() {
        return codice;
    }

    public Piano getPiano() {
        return piano;
    }


}