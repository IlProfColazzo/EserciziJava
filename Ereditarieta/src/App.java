public class App {
    public static void main(String[] args) throws Exception {
        
        Persona p = new Persona("Mario", "Rossi", "RSSMRA", 0);

        Docente d = new Docente("Andrea", "Colazzo", "CLZNDR", 100, 1000);
        
        Studente s = new Studente("Luigi", "NERI", "NRELGU", 100, 4.66);

        d.dormi(); //richiamo un metodo della classe padre di docente
        d.insegna(); //richiamo un metodo della classe docente (che non è padre di nessuno)
        
        s.dormi();
        //ILLEGALE s.insegna();

        Mammifero m = new Mammifero();
        m.verso();

        Cane c = new Cane();
        c.verso();
        Canguro ca = new Canguro();
        ca.verso();
    
    }
}
