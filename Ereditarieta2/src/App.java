import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception{

        /* 
        HashMap<String, Sciatore> sciatori = new HashMap<>();
        HashMap<String, Calciatore> calciatori = new HashMap<>();

        //lettura del file
        File input = new File("input.txt");
        Scanner s = new Scanner(input);

        while (s.hasNextLine()) {
            String riga = s.nextLine();
            String[] rigaSplittata = riga.split(";");
            if(rigaSplittata[0].equals("S")){
                Sciatore sciatore = new Sciatore(Integer.parseInt(rigaSplittata[2]), rigaSplittata[1], rigaSplittata[3].trim());
                sciatori.put(rigaSplittata[1], sciatore);
            }
            else{
                Calciatore calciatore = new Calciatore(Integer.parseInt(rigaSplittata[2]), rigaSplittata[1], Integer.parseInt(rigaSplittata[3].trim()));
                calciatori.put(rigaSplittata[1], calciatore);
            }
        }

        for (Calciatore c : calciatori.values()) {
            c.play();
        }
        for (Sciatore sc : sciatori.values()) {
            sc.play();
        }

        */

        HashMap<String, Sportivo> sportivi = new HashMap<>();

        //lettura del file
        File input = new File("./input.txt");
        Scanner s = new Scanner(input);

        while (s.hasNextLine()) {
            String riga = s.nextLine();
            String[] rigaSplittata = riga.split(";");
            if(rigaSplittata[0].equals("S")){
                Sciatore sciatore = new Sciatore(Integer.parseInt(rigaSplittata[2]), rigaSplittata[1], rigaSplittata[3].trim());
                sportivi.put(rigaSplittata[1], sciatore);
            }
            else{
                Calciatore calciatore = new Calciatore(Integer.parseInt(rigaSplittata[2]), rigaSplittata[1], Integer.parseInt(rigaSplittata[3].trim()));
                sportivi.put(rigaSplittata[1], calciatore);
            }
        }

        /*
        for (Calciatore c : sportivi.values()) {
            c.play();
        }
        for (Sciatore sc : sportivi.values()) {
            sc.play();
        }*/

        for(String k : sportivi.keySet()){
            if(sportivi.get(k) instanceof Calciatore){
                Calciatore c = (Calciatore)(sportivi.get(k));
                c.play();
            }
            else{
                Sciatore sc = (Sciatore)(sportivi.get(k));
                sc.play();
            }
        }
        
    }
}
