import java.util.ArrayList;

public class Citta {
    private String CAP;
    private String nome;
    private ArrayList<Museo> musei;

    public Citta(String CAP, String nome) {
        this.CAP = CAP;
        this.nome = nome;
        musei = new ArrayList<>();
    }

    public String getCAP() {
        return CAP;
    }

    /*
     * È possibile aggiungere un museo ad una città utilizzando il metodo
     * **addMuseo()** della classe Citta. Tale metodo riceve come parametro un
     * oggetto di classe Museo e restituisce il valore _true_
     *
     */

    public boolean addMuseo(Museo m) {
        musei.add(m);
        return true;
    }
    /*
     * 
     * È possibile ottenere il riferimento ad un museo utilizzando il metodo
     * **getMuseo()** della classe Citta. Tale metodo riceve come parametro una
     * stringa rappresentante il nome del museo che si vuole ottenere e restituisce
     * un riferimento al museo se è presente un museo con quel nome, altrimenti
     * restituisce il valore speciale _null_.
     * 
     */
    public Museo getMuseo(String nome){
        for (Museo museo : musei) {
            if(museo.getNome().equals(nome)) return museo;
        }
        return null; 
    }

}
