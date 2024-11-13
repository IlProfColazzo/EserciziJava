public class Piano {

    private Scaffale scaffali[];
    private Biblioteca biblioteca;
    private int codice;

    public Piano(Biblioteca biblioteca, int codice) {
        this.biblioteca = biblioteca;
        this.scaffali = new Scaffale[30];
        for (int i = 0; i < scaffali.length; i++) {
            scaffali[i] = new Scaffale("SC" + (i+1), this);
        }
        this.codice = codice;
    }

    public boolean addLibro(Libro l, String scaffale, int ripiano){
        if(scaffale.length()>=2){
            if(!scaffale.substring(0 , 2).equals("SC"))
                return false;
            String numeroScaffale = scaffale.substring(2);
            int numeroScaffaleInt = Integer.parseInt(numeroScaffale);
            if(numeroScaffaleInt>30){
                return false;
            }
            return scaffali[numeroScaffaleInt-1].addLibro(l, ripiano);
        }
        return false;
    }

    public boolean contiene(String scaffale, int ripiano){
        if(scaffale.length()>=2){
            if(!scaffale.substring(0 , 2).equals("SC"))
                return false;
            String numeroScaffale = scaffale.substring(2);
            int numeroScaffaleInt = Integer.parseInt(numeroScaffale);
            if(numeroScaffaleInt>30){
                return false;
            }
            return scaffali[numeroScaffaleInt-1].contiene(ripiano);
        }
        return false;
    }

    public String getLibri(String scaffale){
        if(scaffale.length()>=2){
            if(!scaffale.substring(0 , 2).equals("SC"))
                return "scaffale non valido";
            String numeroScaffale = scaffale.substring(2);
            int numeroScaffaleInt = Integer.parseInt(numeroScaffale);
            if(numeroScaffaleInt>30){
                return "scaffale non valido";
            }
            return scaffali[numeroScaffaleInt-1].getLibri();
        }
        return "scaffale non valido";
    }

    public int getCodice() {
        return codice;
    }
    
    
}
