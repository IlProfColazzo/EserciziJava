import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int volume = tastiera.nextInt();
        int canale = tastiera.nextInt();
        Televisore tv = new Televisore(volume, canale);
        tv.stato();
        tv.pulsanteRosso();
        tv.aumentaVolume();
        tv.aumentaVolume();
        tv.canalePrecedente();
        tv.stato();


    }
}
