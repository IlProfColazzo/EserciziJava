public class Studente {
    private String nome;
    private String cognome;
    private String cf;
    public Studente(String nome, String cognome, String cf) {
        this.nome = nome;
        this.cognome = cognome;
        this.cf = cf;
    }

    @Override
    public String toString() {
        return nome + " " + cognome + " " + cf;
    }

    public boolean equals(Studente other) {
        if(other == this) return true;
        //if(cf.equals(other.cf) && nome.equals(other.nome) && cognome.equals(other.cognome))
        //return true;
        return cf.equals(other.cf) && nome.equals(other.nome) && cognome.equals(other.cognome);
    }


}
