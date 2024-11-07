public class Rettangolo {
    
    //attributi
    private double base;
    private double altezza;
    //private double pippo;

    //costruttori
    //Un costruttore è un metodo particolare perchè: 1) ha lo stesso nome della Classe 2) non ha tipo di ritorno

    public Rettangolo(){ //costruttore: modifico (amplia) il comportamento del costruttore di default.
        this.base = 2;
        this.altezza = 5;
    }

        
    /*public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }*/

    public Rettangolo(double base, double altezza) {
        this.base = base; //all'ATTRIBUTO base di QUESTO oggetto assegna il valore del PARAMETRO base
        this.altezza = altezza;
    }


    //metodi
    public double calcolaArea(){
        return this.base*this.altezza;
    }

    
    public double calcolaPerimetro(){
        return (this.base+this.altezza)*2;
    }



    public double getBase(){
        return this.base;
    }

    public double getAltezza(){
        return this.altezza;
    }
}
