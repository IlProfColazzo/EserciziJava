public class Studente extends Persona{

    private double media;
    
    public Studente(String nome, String cognome, String cf, double stanchezza, double media) {
        super(nome, cognome, cf);
        //Richiama il costruttore della classe padre (Persona)
        this.media=media; //completa la costruzione dell'oggetto Studente
    }
    
    public void studia(){
        System.out.println("VADO A DORMIRE CHE E' MEGLIO!");
    }


    
}
