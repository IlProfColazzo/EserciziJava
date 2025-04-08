import java.util.HashMap;

public class Scontrino {
    private int codScontrino;
    private HashMap<String, ProdottoEsposto> prodottiAcquistati;

    public Scontrino(int codScontrino) {
        this.codScontrino = codScontrino;
        prodottiAcquistati = new HashMap<>();
    }

    public void aggiungiProdotto(Prodotto p, int quantita) {
        ProdottoEsposto pEsposto = new ProdottoEsposto(p, quantita);
        prodottiAcquistati.put(p.getCodice(), pEsposto);
    }

    public String dettagliScontrino() {
        String retValue = "" + codScontrino + "\n";
        for(ProdottoEsposto p : this.prodottiAcquistati.values()){
            retValue += p.getCodice() + " " + p.getQuantita() + "\n";
        }
        return retValue.trim();
    }

    public double chiudiScontrino() {
        double totale = 0.0;
        for(ProdottoEsposto prodottoInScontrino : this.prodottiAcquistati.values()){
             totale += prodottoInScontrino.getPrezzoTotale(); 
        }
        return totale;
    }
}
