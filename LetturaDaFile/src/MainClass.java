import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class MainClass {
  public static void main(String[] args) {
    ArrayList<Persona> persone = new ArrayList<>();
    leggiFile("inputFile.txt", v);
    
  }

  private static void leggiFile(String pathFile, ArrayList<Persona> persone){
    try {
      File myFile = new File(pathFile);
      Scanner myReader = new Scanner(myFile);
      //Scanner tastiera = new Scanner(System.in);
      //int somma=0;
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        String[] stringaSplittata = data.split(";");
        if(stringaSplittata.length!=3)
          continue;
        Persona p = new Persona(stringaSplittata[0], stringaSplittata[1],Integer.parseInt(stringaSplittata[2]));
        persone.add(p);
        //somma+=Integer.parseInt(data);
        //persone.add(Integer.parseInt(data));
        System.out.println(data);
      }
      //System.out.println(somma);

      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

  }
}