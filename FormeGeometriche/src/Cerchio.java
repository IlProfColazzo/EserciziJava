public class Cerchio {
    
    private double raggio;

    public Cerchio(double raggio){
        this.raggio=raggio;
    }

    public double calcolaArea(){
        return Math.PI * Math.pow(raggio, 2); 
    }

    public double calcolaCirconferenza(){
        return Math.PI * this.getDiametro(); 
    }

    public double getDiametro(){
        return raggio*2;
    }

}
