import java.util.Collection;
import java.util.LinkedList;

public class Museo {
    private String nome;
    private LinkedList<Opera> opere;
    private int nVisitatori;

    public Museo(String nome, int nVisitatori) {
        this.nome = nome;
        this.nVisitatori = nVisitatori;
        this.opere = new LinkedList();
    }

    public String getNome() {
        return nome;
    }

    /*
     * È possibile aggiungere un quadro ad un museo tramite il metodo
     * **addQuadro()** della classe Museo. Tale metodo riceve come parametro un
     * oggetto di classe Quadro e restituisce il valore _true_.
     * 
     * È possibile aggiungere una Statua ad un museo tramite il metodo
     * **addStatua()** della classe Museo. Tale metodo riceve come parametro un
     * oggetto di classe Statua e restituisce il valore _true_.
     */
    public boolean addQuadro(Quadro q) {
        opere.add(q);
        return true;
    }

    public boolean addStatua(Statua s) {
        opere.add(s);
        return true;
    }

    /*
     * La classe Museo espone il metodo **getOpere()** che restituisce una stringa
     * contenente tutte le Opere. La stringa inizia e termina con il carattere “
     * (virgolette). Ogni opera è rappresentata come una stringa formata da
     * _nomeArtista-nomeOpera-anno_ (es. _Edvard Munch-L’urlo-1910_) ed è separata
     * dalle altre opere tramite il carattere “;”.
     * 
     */
    public String getOpere() {
        String retV = "";
        for (Opera opera : opere) {
            retV += opera + "; ";
        }

        return retV.length() > 0 ? retV.substring(0, (retV.length()) - 2) : retV;
    }

    /*
     * 
     * La classe Museo espone:
     * - il metodo **getOpere()**: restituisce una Collection di tutte le Opere;
     * - il metodo **getQuadri()**: restituisce una Collection di tutti i quadri;
     * - il metodo **getSculture()**: restituisce una Collection di tutte le
     * sculture.
     */
    public Collection<Opera> getCollectionOpere(){
        return opere;
    }
    public Collection<Quadro> getQuadri(){
        LinkedList<Quadro> quadri = new LinkedList<>(); 
        for (Opera opera : opere) {
            if(opera instanceof Quadro) quadri.add((Quadro)opera);
        }
        return quadri;
    }
    public Collection<Statua> getSculture(){
        LinkedList<Statua> statue = new LinkedList<>(); 
        for (Opera opera : opere) {
            if(opera instanceof Quadro) statue.add((Statua)opera);
        }
        return statue;
    }
}
