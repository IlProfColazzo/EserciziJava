public class GestioneScuola {
    public static void main(String[] args) {
       
        //aggiungere le funzionalità:
        //aggiungere uno studente ad una classe
        //ogni studente viene visualizzato come: nome, cognome, CF
        //nel main è necessario visualizzare tutti gli studenti di quella classe
        //data una scuola visualizzare tutti gli studenti della scuola

        Studente s1 = new Studente("Lorenzo", "Mangia", "MNGLRN07");
        Studente s2 = new Studente("Giorgi", "Panariello", "PNRGRG62");
        Studente s3 = new Studente("Filippo", "Rossi", "RSSFLP99");
        Studente s4 = new Studente("Antonio", "Gialli", "XXXXXXX");

        
        Classe terzaDI = new Classe("3DI");
        Classe quartaDI = new Classe("4DI");
        Classe quintaDI = new Classe("5DI");

        terzaDI.aggiungiStudente(s1);
        terzaDI.aggiungiStudente(s4);
        terzaDI.aggiungiStudente(s1);
        terzaDI.aggiungiStudente(s4);
        terzaDI.aggiungiStudente(s1);
        terzaDI.aggiungiStudente(s4);
        terzaDI.aggiungiStudente(s1);
        terzaDI.aggiungiStudente(s4);
        
        quartaDI.aggiungiStudente(s2);
        quintaDI.aggiungiStudente(s3);
        
        Scuola giorgi = new Scuola("G. Giorgi",52);

        giorgi.aggiungiClasse(terzaDI);
        giorgi.aggiungiClasse(quartaDI);
        giorgi.aggiungiClasse(quintaDI);


        System.out.println(terzaDI.visualizzaStudenti());

        System.out.println(terzaDI); //chiamata implicita al toString
        System.out.println(terzaDI.toString()); //chiamata esplicita al toString

        String ciccio = "blablalblbbalablablb" + terzaDI; //qui avviene nuovamente una chiamata implicita al toString

        String ciccio2 = ""+terzaDI;

        //3DI 25 --> desiderata

        //System.out.println(terzaDI.descriviClasse()); BLECH!!
        //GestioneScuola.Classe@816f27d --> situazione attuale


    }
}
