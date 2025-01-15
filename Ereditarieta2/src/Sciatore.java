public class Sciatore extends Sportivo {
    private String specialita;

    public Sciatore(int energia, String specialita){
        super(energia);
        this.specialita = specialita;
    }

    public void play(){ //override e overload
        this.energia -=7; 
    }

    public String play(String a){ //override e overload
        return "Ciao";
    }
    
    public String play2(String a){ //ne override ne overload
        return "Ciao";
    }

    public String play3(String a){ //solo override
        return "Ciao";
    }
}
