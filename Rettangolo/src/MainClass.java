import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

                Rettangolo r1 = new Rettangolo(13,56); //invoco un particolare metodo che
        //si occupa di costruire l'oggetto (allocare memoria e inizializzarla). 
        //Il metodo si chiama costruttore.
        //Ogni classe HA ALMENO UN costruttore!!

        Rettangolo r2 = new Rettangolo();
        /* in caso gli attributi di Rettangolo fossero pubblici
        r1.base = 12;
        r1.altezza = 15;

        r2.base = 9.2;
        r2.altezza = 13.5;
        */

        //r1.setBase(12);
        //r1.setAltezza(15);

        //System.out.println("Base di r1:"+r1.base);
        //System.out.println("Base di r1:"+r1.getBase());
        
        
        System.out.println("Area del rettangolo r1: "+r1.calcolaArea());
        System.out.println("Perimetro del rettangolo r1: "+r1.calcolaPerimetro());

        System.out.println("Area del rettangolo r2: "+r2.calcolaArea());
        System.out.println("Perimetro del rettangolo r2: "+r2.calcolaPerimetro());




    }   
}
