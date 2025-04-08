import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Collections;

public class Supermercato {
    private HashMap<String, Corsia> corsie;
    private HashMap<String, Prodotto> prodotti;
    private int countScontrini;
    private HashMap<Integer, Scontrino> listaScontrini;

    public Supermercato() {
        this.corsie = new HashMap<>();
        this.countScontrini = 1000;
        this.listaScontrini = new HashMap<>();
        this.prodotti = new HashMap<>();
    }

    public void addCorsia(String nome, double capienza) throws CorsiaGiaEsistenteException {
        if (corsie.containsKey(nome)) {
            throw new CorsiaGiaEsistenteException(nome);
        }
        Corsia c = new Corsia(nome, capienza);
        corsie.put(nome, c);
    }

    public Prodotto catalogaProdotto(String codice, String nome, double volume, boolean isFrigo) {
        if (prodotti.containsKey(codice)) {
            return prodotti.get(codice);
        }
        if (isFrigo == true) {
            ProdottoDaFrigo pF = new ProdottoDaFrigo(nome, codice, volume);
            prodotti.put(codice, pF);
            return pF;
        }
        Prodotto p = new Prodotto(nome, codice, volume);
        prodotti.put(codice, p);
        return p;

    }

    public List<Prodotto> elencoProdotti() {
        LinkedList<Prodotto> elencoProdotti = new LinkedList<>(prodotti.values());
        Collections.sort(elencoProdotti, new ConfrontaProdottiPerPrezzoDecrescente());
        return elencoProdotti;
    }

    public Prodotto cercaProdotto(String codice) throws ProdottoInesistenteException {
        if (!prodotti.containsKey(codice)) {
            throw new ProdottoInesistenteException("Prodotto inesistente");
        }
        return prodotti.get(codice);

    }

    public int esponiProdotto(String codiceProdotto, String nomeCorsia, int quantitaDaEsporre) {
        Corsia c = this.corsie.get(nomeCorsia);
        double vtot = c.getCapienzaDisponibile();
        Prodotto p = prodotti.get(codiceProdotto);
        double capProdotto = p.getVolume();
        int prodottiPossibili = (int) (vtot / capProdotto);
        int prodottiDaEsporre;

        if (prodottiPossibili < quantitaDaEsporre) {
            prodottiDaEsporre = prodottiPossibili;
        } else {
            prodottiDaEsporre = quantitaDaEsporre;
        }
        corsie.get(nomeCorsia).esponiProdotto(p, quantitaDaEsporre);
        return prodottiDaEsporre;

    }

    public double calcolaPercentualeOccupazione(String nomeCorsia) {
        Corsia c = corsie.get(nomeCorsia);
        return ((c.getCapienza() - c.getCapienzaDisponibile()) / c.getCapienza()) * 100;
    }

    public Collection<String> elencoCodiciProdottoPerCorsia(String nomeCorsia) {
        Corsia c = corsie.get(nomeCorsia);
        return c.elencoCodiciProdottoPerCorsia();

    }

    // E' possibile utilizzare il metodo quantitaProdottoEsposto() della classe
    // Supermercato per ottenere la quantita' esposta per un particolare prodotto.
    // Esistono due varianti del metodo. La prima variante riceve come parametri un
    // riferimento al prodotto ed il nome di una corsia e restituisce la quantita'
    // di prodotto esposto in quella corsia. La seconda variante riceve invece
    // solamente il riferimento al prodotto e restituisce come quantita' esposta per
    // quel prodotto la somma delle quantita' esposte nelle diverse corsie.

    public int quantitaprodottoEsposto(String nomeCorsia, Prodotto riferimentoProdotto) {
        Corsia c = corsie.get(nomeCorsia);
        return c.quantitaProdottoEsposto(riferimentoProdotto);
    }

    public int quantitaprodottoEsposto(Prodotto riferimentoProdotto) {
        int retValue = 0;
        for (Corsia c : corsie.values()) {
            retValue += c.quantitaProdottoEsposto(riferimentoProdotto);

        }
        return retValue;

    }

    public int apriScontrino() {
        Scontrino s = new Scontrino(this.countScontrini);
        listaScontrini.put(countScontrini, s);
        countScontrini++;
        return countScontrini - 1;
    }

    // I prodotti vengono aggiunti ad uno scontrino invocando il metodo
    // acquistaProdotto() della stessa classe, che riceve come parametri il codice
    // dello scontrino, il riferimento all'oggetto di tipo Prodotto da aggiungere,
    // la corsia da cui prelevarlo e la quantita' (potra' essere prelevata dalla
    // corsia una quantita' al piu' pari a quella disponibile). In caso di corsia
    // inesistente il metodo scatenera' una eccezione di tipo
    // CorsiaInesistenteException.

    public void acquistaProdotto(int codScontrino, Prodotto p, String nomeCorsia, int quantita)
            throws CorsiaInesistenteException {
        Corsia c = corsie.get(nomeCorsia);
        if (c == null) {
            throw new CorsiaInesistenteException();
        }
        Scontrino s = listaScontrini.get(codScontrino);

        int quantitaPesposto = this.quantitaprodottoEsposto(nomeCorsia, p);
        if (quantitaPesposto == 0) {
            return;
        }
        if (quantita > quantitaPesposto)
            quantita = quantitaPesposto;
        s.aggiungiProdotto(p, quantita);
        c.sottraiProdotto(p, quantita);

    }

    // Mediante il metodo dettagliScontrino() e' possibile ottenere, per un
    // determinato scontrino, le informazioni relative ai prodotti acquistati ed
    // alle relative quantita'. Il metodo riceve come parametro il codice dello
    // scontrino e restituisce una stringa che riporta, nella prima riga, il codice
    // dello scontrino e, nelle righe successive il codice del prodotto e la
    // relativa quantita' separati da uno spazio. Tutte le righe tranne l'ultima
    // sono terminate da \n.

    public String dettagliScontrino(int codiceScontrino) {
        return this.listaScontrini.get(codiceScontrino).dettagliScontrino();
    }

    // Il metodo chiudiScontrino() riceve come parametro il codice dello scontrino
    // da chiudere e restituisce l'importo totale da pagare, calcolato in base alle
    // diverse quantita' di prodotto acquistate ed applicando eventuali sconti ai
    // prezzi di listino.

    public double chiudiScontrino(int codiceScontrino) {
        return this.listaScontrini.get(codiceScontrino).chiudiScontrino();
    }

    /*
     * Il metodo leggiFile() della classe Supermercato permette di leggere da file
     * le informazioni relative ai prodotti trattati ed alla relativa esposizione
     * nelle corsie.
     * 
     * Il metodo riceve come parametro il percorso di un file testuale organizzato
     * per righe, dove ogni riga puo' riportare le informazioni relative ad un
     * prodotto (da frigo o non) o all'esposizione. Si assuma che le informazioni
     * siano separate da un punto e virgola.
     * 
     * Le righe relative ad un prodotto non da frigo cominciano con la stringa
     * PRODOTTO_NO_FRIGO, seguita da codice, nome, volume, prezzo e percentuale di
     * sconto del prodotto. Le righe relative ad un prodotto da frigo cominciano
     * invece con PRODOTTO_DA_FRIGO e, dopo le informazioni sopra indicate,
     * riportano anche la temperatura di conservazione.
     * 
     * Infine, le righe relative all'esposizione di un prodotto cominciano con la
     * stringa ESPOSIZI_PRODOTTO, seguita da codice prodotto, nome corsia e
     * quantita' da esporre.
     */

     public void leggiFile(String path) throws FileNotFoundException{
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            /*StringTokenizer st = new StringTokenizer(line, ";");
            p = this.catalogaProdotto(st.nextToken(), splittedLine[2], Double.parseDouble(splittedLine[3]), false);
            }*/
            String[] splittedLine = line.split(";");
            Prodotto p = null;
            switch (splittedLine[0]) {
                case "PRODOTTO_NO_FRIGO":
                    p = this.catalogaProdotto(splittedLine[1], splittedLine[2], Double.parseDouble(splittedLine[3]), false);            
                    p.setPrezzo(Double.parseDouble(splittedLine[4]));
                    p.setSconto(Double.parseDouble(splittedLine[5]));
                    break;
                case "PRODOTTO_DA_FRIGO":
                    p = this.catalogaProdotto(splittedLine[1], splittedLine[2], Double.parseDouble(splittedLine[3]), true);            
                    p.setPrezzo(Double.parseDouble(splittedLine[4]));
                    p.setSconto(Double.parseDouble(splittedLine[5]));
                    ((ProdottoDaFrigo)p).setTemperatura((Double.parseDouble(splittedLine[6])));
                    break;
                case "ESPOSIZI_PRODOTTO":
                    this.esponiProdotto(splittedLine[1], splittedLine[2], Integer.parseInt(splittedLine[3]));
                break;
            } 
        }
        scanner.close();


     }
}
