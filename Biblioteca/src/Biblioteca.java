public class Biblioteca {

    private Piano piani[];

    public Biblioteca() {
        this.piani = new Piano[3];
        for (int i = 0; i < piani.length; i++) {
            this.piani[i] = new Piano(this,i);
        }
    }

    public boolean addLibro(Libro l, int piano, String scaffale, int ripiano){
        if(piano<3 && piano>=0){
            return this.piani[piano].addLibro(l, scaffale, ripiano);
        }
        return false;
    }

    public boolean contiene(int piano, String scaffale, int ripiano){
        if(piano<3 && piano>=0){
            return this.piani[piano].contiene(scaffale, ripiano);
        }
        return false;
    }

    public String getLibri(int piano, String scaffale){
        if(piano<3 && piano>=0){
            return this.piani[piano].getLibri(scaffale);
        }
        return "piano non valido";
    }

    public boolean cerca(String autore, String titolo){
        //TO DO
        return false;
    }
    
}
