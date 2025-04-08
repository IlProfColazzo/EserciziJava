public class ProdottoEsposto {
    private Prodotto p;
    private int quantita;

    public ProdottoEsposto(Prodotto p, int quantita) {
        this.p = p;
        this.quantita = quantita;
    }

    public double getVolume() {
        return p.getVolume() * quantita;
    }

    public void addQuantita(int quantita) {
        this.quantita += quantita;
    }

    public int getQuantita() {
        return quantita;
    }

    public void subQuantita(int quantita) {
        this.quantita -= quantita;
    }

    public String getCodice() {
        return p.getCodice();
    }

    public double getPrezzoTotale() {
        return (this.p.getPrezzo() - (this.p.getPrezzo() * this.p.getSconto() / 100)) * this.quantita;
    }
}
