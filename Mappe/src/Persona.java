public class Persona {
    private String cf;
    private String nome;
    private String cognome;


    public Persona(String cf, String nome, String cognome) {
        this.cf = cf;
        this.nome = nome;
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return cf + "-" + nome + "-" + cognome;
    }

    public String getCf() {
        return cf;
    }

}
