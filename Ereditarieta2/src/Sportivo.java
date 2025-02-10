public abstract class Sportivo {

    protected int energia;
    private String cf;

    public Sportivo(int energia, String cf){
        this.energia = energia;
        this.cf = cf;
    }

    public abstract void play();

    public void decrementaEnergia(int e){
        this.energia-=e;
    }

}
