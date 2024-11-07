public class Quadrato {
    private double lato;

    public Quadrato(double lato){
        this.lato = lato;
    }

    public double calcolaPerimetro(){
        return this.lato*4;
    }

    public double calcolaArea(){
        return this.lato*this.lato;
    }

    public double getDiagonale(){
        return Math.sqrt(2)*this.lato;
    }

}
