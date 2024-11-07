import java.util.Scanner;

//#include <string.h>

public class IntroJava {
    public static void main(String[] args) {
        double pi = 3.14;
        int pippo=42;
        char c='a';

        int inputIntero=0;
        double inputDouble=0.0;
   
        System.out.println("Questo sono le mie variabili: "+pippo+" "+pi+" "+c);

        //printf("Inserisci un numero: ");
        //scanf("%d",&inputIntero);

        Scanner tastiera = new Scanner(System.in);
        //va scritta una sola volta!!!!

        System.out.println("Inserisci un intero: ");
        inputIntero = tastiera.nextInt(); //corrisponde alla scanf di un intero
        System.out.println("Inserisci un double: ");
        inputDouble = tastiera.nextDouble(); //corrisponde alla scanf di un double
        System.out.println("i dati inseriti sono: " +inputIntero + " " + inputDouble);
        tastiera.close(); //viene scritto quando si è certi che non verrà fatto più input

       //if-for-while-doWhile-switch tutto identico al C

        //int v[25];
        //in java per utilizzare i vettori è necessario fare due operazioni:
        //1) dichiarazione
        //2) allocazione

        int v[];//dichiarazione del vettore sintassi C-style
        v = new int[25]; //allocazione del vettore

        int v2[] = new int[25];//dichiarazione e allocazione del vettore 

        /*In Java posso allocare un vettore a seguito di input della dimensione.
         * Cosa illegale in C!!!
         */
        int dim = tastiera.nextInt();
        int vettore[] = new int[dim];

        for (int i = 0; i < dim; i++) {
            vettore[i]=tastiera.nextInt();
            //scanf("%d",&vettore[i]);
        }
        for (int i = 0; i < dim; i++) {
            System.out.print(""+vettore[i]+ " ");
            //printf("%d",vettore[i]);
        }

        for (int i = 0; i < vettore.length; i++) {
            /*se dopo il nome del vettore scrivo .length ottengo in automatico
             * la dimensione del vettore.
             * In C non esiste
             */
        }

        for (int elemento : vettore) { //for-each usato quando è necessario scorrere
            //l'intero vettore e non si ha bisogno dell'indice
            //!!!!ATTENZIONE: non è possibile utilizzarlo per l'input!!!!
            System.out.println(elemento);
        }
        
    }
}
