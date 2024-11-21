import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        /*Studente [] studenti = new Studente[100];
        int nstudenti=0;*/

        ArrayList<Studente> studenti = new ArrayList<>();
        //ho creato un arraylist in grado di contenere degli studenti

        Studente s = new Studente("AAA", "BBB", "CCC");
        studenti.add(s); //aggiungo un oggetto all'interno della lista

        Studente s1 = new Studente("DDD", "EEE", "FFF");
        studenti.add(s1);

        Studente s3 = new Studente("AAA", "BBB", "CCC");


        if(s.equals(s3)){
            System.out.println("Studenti uguali");
        }
        else{
            System.out.println("Studenti diversi");
        }

        //System.out.println(studenti[0]);
        
        System.out.println(studenti.get(0));

        for (Studente studente : studenti) {
            
        }

        for (int i = 0; i < studenti.size(); i++) {
            studenti.get(i);
        }



        
    }
}
