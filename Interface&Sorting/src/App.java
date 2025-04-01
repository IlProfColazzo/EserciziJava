import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        
        TreeMap<String,Persona> persone = new TreeMap<>();

        persone.put("ZZZ", new Persona("ZZZ", "Alberto", "ZZZ", 18));
        persone.put("BBB", new Persona("BBB", "Gabriele", "BBB",12));
        persone.put("AAA", new Persona("AAA", "Antonio", "AAA",21));

        for (Persona p : persone.values()) {
            System.out.println(p);
        }

        
        LinkedList<Persona> lista = new LinkedList<>(persone.values());


        Collections.sort(lista);
        //in ordine di eta: Gabriele, Alberto, Antonio
        for (Persona p : lista) {
            System.out.println(p);
        }

        







    }
}
