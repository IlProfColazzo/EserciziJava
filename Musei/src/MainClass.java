import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        String percorso = "input.txt";
        MMS gestioneMusei = new MMS();
        leggiFile(percorso, gestioneMusei);

    }

    public static void leggiFile(String percorso, MMS mms){
        File file = new File(percorso);
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                Citta c = null;
                Museo m = null;
                Opera o = null;
                String riga = scanner.nextLine();
                String[] arrayStr = riga.split(";");;
                if(arrayStr[0].equals("C")){
                    c = new Citta(arrayStr[1], arrayStr[2]);
                    mms.addCitta(c);
                } else if (arrayStr[0].equals("M")){
                    m = new Museo(arrayStr[1], Integer.parseInt(arrayStr[2]));
                    c.addMuseo(m);
                } else if(arrayStr[0].equals("O")){
                    o = new Opera(arrayStr[1],arrayStr[2],Integer.parseInt(arrayStr[3]), Double.parseDouble(arrayStr[4]));
                    m.addOpera(o);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
