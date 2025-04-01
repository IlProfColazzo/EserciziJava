import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class D {

    public static void readFile(String nomeFile) throws FileNotFoundException{
        File f = new File(nomeFile);
        Scanner s = new Scanner(f);
    }
    
}
