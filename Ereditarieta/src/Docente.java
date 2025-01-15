public class Docente extends Persona{

    private double stipendio;
    
    
    public Docente(String nome, String cognome, String cf, double stanchezza, double stipendio) {
        super(nome, cognome, cf, stanchezza);
        //Richiama il costruttore della classe padre (Persona)
        this.stipendio=stipendio; //completa la costruzione dell'oggetto Docente
    }
    
    public void insegna(){
        System.out.println("YHEEEEEEE");
    }

    
}
