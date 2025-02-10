public class Calciatore extends Sportivo {

    private int nMaglia;
    
    public Calciatore(int energia, String cf, int nMaglia){
        super(energia,cf);
        this.nMaglia = nMaglia;
    }

    
    @Override
    public void play(){
        super.energia-=2;
    }

    
}
