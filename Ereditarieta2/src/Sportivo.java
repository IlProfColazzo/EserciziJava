public class Sportivo {
    protected int energia;

    public Sportivo(int energia){
        this.energia = energia;
    }

    public void play(){
        this.energia--;
    }

    public void decrementaEnergia(int e){
        this.energia-=e;
    }

    
    public String play(String a){
        return "Hello";
    }

    
    public String play3(String a){
        return "Hello";
    }

}
