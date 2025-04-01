import java.util.Comparator;

public class Persona implements Comparable<Persona>{
    
    private String cf;
    private String nome;
    private String cognome;
    private int eta; 

    public Persona(String cf, String nome, String cognome,int eta) {
        this.cf = cf;
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    @Override
    public String toString() {
        return cf;
    }
        
    public String getNome() {
        return nome;
    }

    //confronto le eta
    @Override
    public int compareTo(Persona other) {
        //confronta this con other
        //ritornare > 0 se this > other
        //ritornare < 0 se this < other
        //ritornare = 0 se this == other
        /*
        if(this.eta > other.eta){
            return 1;
        }
        if(this.eta < other.eta){
            return -1;
        }
        return 0;
         */
        return (this.eta - other.eta);
    }
    

}
