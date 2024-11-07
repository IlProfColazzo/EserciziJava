public class Triangolo {
    private double lato1;
    private double lato2;
    private double lato3;

    //costruisce un triangolo equilatero
    public Triangolo(double lato){
        this.lato1=lato;
        this.lato2=lato;
        this.lato3=lato;
    }

    //costruisce un triangolo isoscele con lato1 "duplicato" 
    public Triangolo(double lato1, double lato2){
        this.lato1=lato1;
        this.lato2=lato1;
        this.lato3=lato2;
    }

    public Triangolo(double lato1, double lato2, double lato3){
        this.lato1=lato1;
        this.lato2=lato2;
        this.lato3=lato3;
    }

    public double calcolaArea(){
        double p = this.calcolaPerimetro()/2;
        return Math.sqrt(p*(p-this.lato1)*(p-this.lato2)*(p-this.lato3));
    }

    public double calcolaPerimetro(){
        return this.lato1 + this.lato2 + this.lato3;
    }

    public static boolean isTriangolo(double l1, double l2, double l3){
        //to do
        return true;
    }
}
