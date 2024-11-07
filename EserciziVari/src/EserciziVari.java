import java.util.Scanner;
import java.util.Random;
public class EserciziVari {
   public static void main(String[] args) {
    Scanner tastiera = new Scanner(System.in);
    // esercizio1(tastiera);
    // esercizio2(tastiera);
    esercizio3(tastiera);

   } 
   public static void esercizio1(Scanner tastiera){
    System.out.println("inserisci la dimensione del vettore ");
    int n=tastiera.nextInt();
    int[] v = new int[n];
    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    for(int i=0; i<v.length; i++){
        v[i]=tastiera.nextInt();
    }

    for(int i=0; i<v.length; i++){
        if(v[i]> max) max = v[i];
        if(v[i]< min) min = v[i];
    }
    System.out.println("Il massimo nel vettore e': " + max + " Il minimo: " + min);

   }
   public static void esercizio2(Scanner tastiera){
    Random generator = new Random();
    System.out.println("inserisci la dimensione delle righe ");
    int r=tastiera.nextInt();
    System.out.println("inserisci la dimensione delle colonne ");
    int c=tastiera.nextInt();
    int[][] m = new int[r][c];
    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    for(int i=0; i<m.length; i++){
        for(int j = 0; j < m[i].length; j++){
            m[i][j]=generator.nextInt(100);
        }

    }

    for(int i=0; i<m.length; i++){
        for(int j = 0; j < m[i].length; j++){
        if(m[i][j]> max) max = m[i][j];
        if(m[i][j]< min) min = m[i][j];
        }
    }
    System.out.println("Il massimo nella matrice e': " + max + " Il minimo: " + min);

   }
   public static void esercizio3(Scanner tastiera){
    System.out.println("Scrivi il numero di stringhe: ");
    int n = tastiera.nextInt();
    int maxLength = 0, maxVocali=0, maxConsonanti=0;
    int pos = 0, posMaxVocali=0, posMaxConsonanti=0;
    String[] strV = new String[n];
    for(int i = 0; i<strV.length; i++){
        strV[i] = tastiera.next();
    }
    for(int i = 0; i<strV.length; i++){
        if(strV[i].length()>maxLength){
            maxLength = strV[i].length();
            pos = i;
        }
        int vocali=contaVocali(strV[i]);
        if(vocali>maxVocali){
            maxVocali = vocali;
            posMaxVocali = i;
        }
        int consonanti=contaConsonanti(strV[i]);
        if(consonanti>maxConsonanti){
            maxConsonanti = consonanti;
            posMaxConsonanti = i;
        }

    }
    System.out.println("La stringa piu' lunga e' "+strV[pos]);
    System.out.println("La stringa con il mag. n. di vocali e' "+strV[posMaxVocali]);
    System.out.println("La stringa con il mag. n. di consonanti e' "+strV[posMaxConsonanti]);
   }

   public static int contaVocali(String s){
    int cnt=0;
    String smin = s.toLowerCase();
    for (int i = 0; i < s.length(); i++) {
        char c = smin.charAt(i);
        if(isVocale(c)){
            cnt++;
        } 
    }
    return cnt;
   }
   public static boolean isVocale(char c){
    /*if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
    return true;
    else
    return false;*/
    return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
   }

   public static int contaConsonanti(String s){
    int cnt=0;
    String smin = s.toLowerCase();
    for (int i = 0; i < s.length(); i++) {
        char c = smin.charAt(i);
        if(!isVocale(c) && c>='a' && c<='z'){
            cnt++;
        } 
    }
    return cnt;
   }
}
