import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<Animale> animali = new LinkedList<>();

        animali.add(new Cane());
        animali.add(new Cane());
        animali.add(new Cane());
        animali.add(new Cane());
        animali.add(new Cane());
        animali.add(new Cane());
        animali.add(new Gatto());
        animali.add(new Gatto());
        animali.add(new Gatto());
        animali.add(new Gatto());
        animali.add(new Gatto());
        animali.add(new Gatto());
        animali.add(new Gatto());
        animali.add(new Gatto());

        /*for (Animale animale : animali) {
            if(animale instanceof Cane){
                Cane c = (Cane)animale;
                c.faiVerso();
            }
            else{
                ((Gatto)animale).faiVerso();
            }
        }*/

        for (Animale animale : animali){
            animale.faiVerso(); //polimorfismo
            if(animale instanceof Cane){
                ((Cane)animale).mangia(); //no polimorfismo
            }
        }
    }
}
