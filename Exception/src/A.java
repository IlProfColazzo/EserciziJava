import java.io.FileNotFoundException;

public class A {

    public static void readFile(String nomeFile) throws FileNotFoundException{
        B.readFile(nomeFile);
    }

    public void saluta(){};
    
}
