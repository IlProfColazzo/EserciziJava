public class Calciatore extends Sportivo {
    private int nMaglia;
    
    public Calciatore(int energia, int nMaglia){
        super(energia);
        this.nMaglia = nMaglia;
    }

    
    @Override
    public void play(){
        super.energia-=2;
        // this.energia-=2;
        // decrementaEnergia(2);
    }

    
}
