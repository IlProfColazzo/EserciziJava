public class Sciatore extends Sportivo {
    
    private String specialita;

    public Sciatore(int energia, String cf, String specialita){
        super(energia,cf);
        this.specialita = specialita;
    }

    @Override
    public void play(){
        this.energia -=7; 
    }

}
