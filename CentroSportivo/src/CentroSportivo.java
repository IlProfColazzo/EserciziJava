import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors


public class CentroSportivo {
    LinkedList<Attivita> attivita = new LinkedList<>();
    private HashMap<String,Socio> soci ;


    public void aggiungiAttivita(String a, String b){
        Attivita p =  new Attivita(a,b);
        attivita.add(p);
    }

    


    /*
     * 
	(Extra: il metodo ritornerà false anche nel caso in cui il socio e/o l'istruttore
     in quel determinato giorno e in quella determinata ora sono già impegnati in 
     altre attività.
     * 
     *1) controllo che il socio non sia impegnato
        - scorro le attività
        - vedo se all'attività i-esima partecipa il socio in oggetto
        -- se vero
        --- controllo se la data corrisponde
        ----se vero
        -----



     2) controllo che l'istruttore non sia impegnato 
     */
    public void leggiFile(String path){
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String riga = scanner.nextLine();
            String[] rigaSplittata = riga.split(";");
            if(rigaSplittata[0].equals("S")){
                aggiungiSocio(rigaSplittata[1], rigaSplittata[2], rigaSplittata[3]);

            }
            else if(rigaSplittata[0].equals("I")){
                aggiungiIstruttore(rigaSplittata[1], rigaSplittata[2], rigaSplittata[3]);

            }
            else if(rigaSplittata[0].equals("AT")){
                aggiungiAttivita(rigaSplittata[1], rigaSplittata[2], rigaSplittata[3],rigaSplittata[4],rigaSplittata[5]);

            }

        }

    }

   

public  void scriviFile(String path) {
    try {
      FileWriter myWriter = new FileWriter(path);
      for (Socio s : soci.values()) {
        String getSoci = "S;" + s.getNome() + ";" + s.getCognome() + ";" + s.getCs() + "\n";
        myWriter.write(getSoci);
        
      }
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  
}
}
