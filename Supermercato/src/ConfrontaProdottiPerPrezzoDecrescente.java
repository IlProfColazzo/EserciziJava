import java.util.Comparator;

public class ConfrontaProdottiPerPrezzoDecrescente implements Comparator<Prodotto> {

   public int compare(Prodotto o1, Prodotto o2){
        if(o1.getPrezzo()==o2.getPrezzo()){
            return 0;
            

        }if(o1.getPrezzo()>o2.getPrezzo()){
            return -1;
        }
            return 1;
       // return Double.compare(o1.getPrezzo(), o2.getPrezzo());

   }
}  

