import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String,Persona> persone = new HashMap<>();
        //TreeMap<String,Persona> persone2 = new TreeMap<>();
        //LinkedHashMap<String,Persona> persone3 = new LinkedHashMap<>();
        


        Persona p = new Persona("ABC", "Antonio", "DiMaggio");
        persone.put("ABC", p);
        //System.out.println(persone.get("ABC"));

        Persona p2 = new Persona("ABC", "Luigi", "Rossi");
        persone.put("ABC", p2);

        System.out.println(persone.get("ABC"));

        Persona p3 = new Persona("DEF", "Mario", "Gialli");
        persone.put(p3.getCf(), p3);

        if(persone.containsKey("DEF")){
            //Torna vero se dentro la mappa c'è una chiave DEF
            //Falso altrimenti
        }

        if(persone.get("DEF")!=null){
            //Torna vero se dentro la mappa c'è una chiave DEF
            //Falso altrimenti
        }

        for (String k : persone.keySet()) { //itero sulle chiavi
            System.out.println(persone.get(k)); //accedo al valore utilizzando la chiave k
        }

        for (Persona px : persone.values()) { //itero sui valori
            System.out.println(px);
        }

        for (Map.Entry<String, Persona> coppia : persone.entrySet()) { //itero sulla coppia chiave-valore
            System.out.println("Chiave: " + coppia.getKey());
            System.out.println("Valore: " + coppia.getValue());
        }

    }
}
