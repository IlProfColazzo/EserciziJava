public class Studente {
    private String nome;
    private String cognome;
    private String codiceFiscale;

    public Studente(String nome,String cognome,String codiceFiscale){
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }

    public void aggiungiClasse(Classe c){ //setter
        this.classeAppartenenza = c;
    }

    public String getDescrizioneStudente(){
        return this.nome + " " + this.cognome + " " + this.codiceFiscale;
    }

    public String toString(){
        return this.nome + " " + this.cognome + " " + this.codiceFiscale;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void visualizzaStudente(){
        System.out.println(nome + " " + cognome + " " + codiceFiscale);
    }
    

}
