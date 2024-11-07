import java.util.Random;
import java.util.Scanner;
public class Trasposta{

    public static void main(String[] args) {
        Scanner tastiera= new Scanner(System.in);
        System.out.println("Inserisci numero di righe");
        int r=tastiera.nextInt();
        System.out.println("Inserisci numero di colonne");
        int c=tastiera.nextInt();
        int[][]m1=new int [r][c];
        int[][]m2=new int [c][r];
        riempi_matrice(m1);
        matrice_trasporta(m1, m2);
        visualizza_matrice(m1);
        visualizza_matrice(m2);
        tastiera.close();
    }

    public static void riempi_matrice(int m1[][]){
        Random generatore= new Random();
        for(int i=0; i<m1.length;i++){
            for(int j=0;j<m1[i].length; j++){
                m1[i][j]=generatore.nextInt(100);
            }

        }
    }
     public static boolean matrice_trasporta(int m1[][], int m2[][]){
        if(m1.length != m2[0].length || m1[0].length != m2.length){
            return false; 
        }
        for(int i = 0 ; i < m2.length ; i++ ){
            for(int j = 0 ; j < m2[i].length ; j++){
                m2[i][j] = m1[j][i];
            }
        }
        return true;
     }

     public static void visualizza_matrice(int m1[][]){
        for(int i = 0 ; i < m1.length ; i++){
            for(int j = 0 ; j < m1[i].length ; j++){
                System.out.print(m1[i][j] + " ");
            }
        System.out.println();
        }
     }




}