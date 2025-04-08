import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class Corsia {
    private String nome;
    private double capienza;
    private HashMap<String, ProdottoEsposto> prodottiEsposti;
    public Corsia(String nome, double capienza) {
        this.nome = nome;
        this.capienza = capienza;
        prodottiEsposti = new HashMap<>();
    }
    public double getCapienzaDisponibile(){
        double volumeTotate = 0.0;
        for (ProdottoEsposto p : prodottiEsposti.values()) {
            volumeTotate += p.getVolume();
        }
        return capienza - volumeTotate;
    }
    public void esponiProdotto(Prodotto p, int quantita){
        if(!(prodottiEsposti.containsKey(p.getCodice()))){
        this.prodottiEsposti.put(p.getCodice(),new ProdottoEsposto(p, quantita));

        }else{
            this.prodottiEsposti.get(p.getCodice()).addQuantita(quantita);
        }
    }

    public double getCapienza() {
        return capienza;
    }

    public Collection<String> elencoCodiciProdottoPerCorsia(){
       LinkedList<String> p = new LinkedList<>(prodottiEsposti.keySet());
       Collections.sort(p);
       return p;
    }
    public int quantitaProdottoEsposto(Prodotto riferimentoProdotto){
       String daCercare= riferimentoProdotto.getCodice();
       if(prodottiEsposti.containsKey(daCercare)){
         return prodottiEsposti.get(daCercare).getQuantita();
               
        } else{
        return 0;      
     }
    }
    public void sottraiProdotto(Prodotto p , int quantita){
        ProdottoEsposto pEsposto = prodottiEsposti.get(p.getCodice());
        pEsposto.subQuantita(quantita);
        if(pEsposto.getQuantita()==0){
            prodottiEsposti.remove(p.getCodice());
        }
    }

}
