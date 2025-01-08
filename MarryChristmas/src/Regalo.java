public class Regalo {

    private String codice;
    private String descrizione;
    private double peso;
    private Bambino destinatario;

    public Regalo(String codice, String descrizione, double peso) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.peso = peso;
    }

    public Bambino getDestinatario() {
        return this.destinatario;
    }

    public void setDestinatario(Bambino destinatario) {
        this.destinatario = destinatario;
    }

    public String getCodice() {
        return this.codice;
    }

    @Override
    public String toString() {
        return this.descrizione;
    }
    public double getPeso() {
        return this.peso;
    }
    
    
}
