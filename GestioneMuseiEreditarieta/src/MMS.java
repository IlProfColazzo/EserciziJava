import java.util.HashMap;

public class MMS {
    private HashMap<String, Citta> citta;

    public MMS() {
        this.citta = new HashMap<>();
    }

    /*
     * 
     * È possibile aggiungere una nuova città al sistema utilizzando il metodo
     * **addCitta()** della classe MMS. Tale metodo riceve come parametro un oggetto
     * di classe Citta e restituisce un boolean: true nel caso in cui l’inserimento
     * è andato a buon fine, false altrimenti. Un inserimento può fallire se si
     * prova ad aggiungere una città con un CAP già inserito.
     */

    public boolean addCitta(Citta c) {
        String cap = c.getCAP();
        if (citta.containsKey(c))
            return false;
        else {
            citta.put(cap, c);
            return true;
        }
    }
    /*
     * È possibile ottenere il riferimento ad una città utilizzando il metodo
     * **getCitta()** della classe MMS. Tale metodo riceve come parametro una
     * stringa rappresentante il CAP della città che si vuole ottenere e restituisce
     * un riferimento alla città se è presente nel sistema, altrimenti restituisce
     * il valore speciale _null_.
     */

    public Citta getCitta(String cap) {
        return citta.get(cap);
    }
}