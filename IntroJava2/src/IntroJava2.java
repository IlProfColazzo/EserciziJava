import java.util.Scanner;
public class IntroJava2 {
    public static void main(String[] args) {
        int []vettore = new int[25];

        /* In Java tutto viene inizializzato con dei valori di
         * default. (solo in un caso)
         * int = 0
         * double = 0.0
         * boolean = false
         */

         int [][]matrice = new int[10][20];
         //matrice con 10 righe e 20 colonne

         //matrice.length vale il numero di righe --> 10
         for (int i = 0; i < matrice.length; i++) {
            //matrice[i].length vale il numero di colonne della riga i-esima --> 20
            for (int j = 0; j < matrice[i].length; j++) {
                
            }
         }

         /*  In C una stringa è un vettore di caratteri
             char nome[25];
         */
        //char[] nome = new char[25]; blech!!! NO STRINGA, MA VETTORE DI CARATTERI!!!
        String nome="Ettorino"; //la S è MAIUSCOLA
        //ATTENZIONE: la stringa è a lunghezza variabile!!! In Java non definiremo mai la dimensione
        System.out.println("Benvenuto " + nome + " inserisci la tua password:");

        /* Input, output, lunghezza, confronto tra stringhe
         * scanf("%s",nome); gets(nome); fgets(nome,N,stdin);
         * printf("%s",nome); puts(nome); fputs(nome,N,stdout);
         * int size = strlen(nome);
         * if(strcmp(nome,"Andrea")==0)
        */

        //Input
        Scanner tastiera = new Scanner(System.in);

        String password = tastiera.nextLine(); //input

        //System.out.println(cognome + " " + nome); //output

        System.out.println("La tua password è lunga "+password.length()+ " caratteri"); //lunghezza
        //Attenzione: questo .length ha le parentesi!!!!

        //E' sbagliatissimo utilizzare == nel confronto tra stringhe.
        //Anche se in alcuni casi sembra funzionare.
        String passwordCorretta = "passwordSegreta";
        if(password.compareTo(passwordCorretta)==0){
            //primaStringa.compareTo(secondaStringa)
            System.out.println("Password corretta");
        }
        else{
            System.out.println("Password errata");
        }

        
        if(password.equals(passwordCorretta)){
            //primaStringa.equals(secondaStringa)
            System.out.println("Password corretta");
        }
        else{
            System.out.println("Password errata");
        }

        //if(isUpper('C'))
        /*
         * In C abbiamo usato gli interi per raggiare il problema dell'assenza dei booleani
         * int flag=0;
         * int isPrimo = 1;
         * int isBisestile = 0;
         */

        /*
         * In Java esistono i booleani. Le variabile possono assumere solo il valore vero
         * o il valore falso.
         */

         boolean flag = false;
         boolean isPrimo = true;
         boolean isBisestile = false;


         //int x = tastiera.nextInt();
         //String parola = tastiera.nextLine();
         //ho lo stesso problema del C, in parola ci andrà a finire il \n
         //Soluzione:
         int x = tastiera.nextInt();
         tastiera.nextLine(); //Elimina il \n dal buffer
         String parola = tastiera.nextLine();
         System.out.println("La parola inserità vale: "+parola);

         /*
          if(isLower(stringa[i])){
            stringa[i]=toUpper(stringa[i]);
          }
         */
         for (int i = 0; i <parola.length(); i++) {
            if(parola.charAt(i)>='a' && parola.charAt(i)<='z'){
                //NOOOOOOOOOOOOOOOOOOOOOOO
                //In JAVA le stringhe sono !!!IMMUTABILI!!!
                //E' impossibile modificare i singoli caratteri
                //stringaMaiuscola[i]=toUpper(parola[i]); modifico un singolo carattere
                //non esistono modi per accedere in scrittura ai singoli caratteri
                //di un stringa
            }
         }

         String stringaMaiuscola="";
         for (int i = 0; i <parola.length(); i++) {
            if(parola.charAt(i)>='a' && parola.charAt(i)<='z'){
                stringaMaiuscola = stringaMaiuscola +Character.toString(parola.charAt(i) - 32);
            
            }
            else{
                stringaMaiuscola = stringaMaiuscola + parola.charAt(i);
            }
         }
         System.out.println(stringaMaiuscola);

        tastiera.close();

    }

}