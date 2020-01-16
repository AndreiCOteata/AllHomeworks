package AllHomeworks.Homeworks_old;

import java.util.Scanner;

public class Matrice1 {
    private static Scanner in = new Scanner(System.in);
    private static int index1 = 0;
    private static int index2 = 0;
    public static void main(String[] args) {
        System.out.println("Da-ti dimensiunea patratica a matricei: ");
        int n = in.nextInt();
        int[][] matrice = new int[n][n];
        System.out.println();
        Citire(matrice,n);
        Afisare(matrice,n);
        System.out.println();
        System.out.println("Afisare Diagonala principala");
        AfisareDiagonalaP(matrice,n);
        System.out.println();
        System.out.println("Afisare Diagonala Secundara");
        AfisareDiagonalaS(matrice,n);
        System.out.println();
        System.out.println("Afisare elemende de deasupra Diagonalei Principale");
        AfisareElementeUp(matrice,n);
        System.out.println();
        System.out.println("Afisare elemende de sub Diagonalei Principale");
        AfisareElementeDown(matrice,n);
    }
    private static void Citire(int[][] x, int n){
        for (index1 = 0; index1 < n ; index1++) {
            for (index2 = 0; index2 < n ; index2++) {
                x[index1][index2] = (n*index1) + index2;
            }
        }
    }
    private static void Afisare(int[][] x, int n) {
        for (index1 = 0; index1 < n; index1++) {
            for (index2 = 0; index2 < n; index2++) {
                System.out.print(x[index1][index2] + " ");
            }
            System.out.println();
        }
    }
    private static void AfisareDiagonalaP(int[][] x, int n) {
        for (index1 = 0; index1 < n; index1++) {
            for (index2 = 0; index2 < n; index2++) {
                if(index1==index2){
                    System.out.print(x[index1][index2] + " ");
                }
            }
        }
    }
    private static void AfisareDiagonalaS(int[][] x, int n){
        for (index1 = 0; index1 < n; index1++) {
            for (index2 = 0; index2 < n; index2++) {
                if(index1+index2==n-1){
                    System.out.print(x[index1][index2] + " ");
                }
            }
        }
    }
    private static void AfisareElementeUp(int[][] x, int n){
        for (index1 = 0; index1 < n; index1++) {
            for (index2 = 0; index2 < n; index2++) {
                if(index1<index2){
                    System.out.print(x[index1][index2] + " ");
                }
            }
        }
    }
    private static void AfisareElementeDown(int[][] x, int n){
        for (index1 = 0; index1 < n; index1++) {
            for (index2 = 0; index2 < n; index2++) {
                if(index1>index2){
                    System.out.print(x[index1][index2] + " ");
                }
            }
        }
    }
}
