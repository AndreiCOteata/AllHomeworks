package AllHomeworks.Homeworks_old;

import java.util.Scanner;

public class Matrice2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Dati dimensiunea matricii patratice:  ");
        int linii = myObj.nextInt();
        int[][]m = new int[linii][linii];
        //int[][]n = new int[linii][linii];
        CitireM(m,linii);
        //CitireM2(n,linii);
        System.out.println();
        Afisare(m,linii);
        System.out.println();
        //Afisare(n,linii);
        Afisare2(m,linii);
        System.out.println();
        Afisare3(m,linii);
        System.out.println();
        Afisare4(m,linii);
    }
    private static void CitireM(int[][]x, int z){
        Scanner myObj = new Scanner(System.in);
        for (int i = 0; i < z ; i++) {
            for (int j = 0; j < z ; j++) {
                System.out.print("x["+i+"]["+j+"]= ");
                x[i][j]= myObj.nextInt();
            }
        }
    }
    private static void Afisare(int[][]x, int z){
        for (int i = 0; i < z ; i++) {
            for (int j = 0; j <z ; j++) {
                System.out.print(x[i][j] +" ");
            }
            System.out.println();
        }
    }
    private static void CitireM2(int[][]x, int z){
        for (int i = 0; i <z ; i++) {
            for (int j = 0; j < z; j++) {
                x[i][j] = z*i+j;
            }
        }
    }
    private static void Afisare2(int[][]x, int z){
        for (int i = 0; i < z ; i++) {
            for (int j = z-1; j>=0 ; j--) {
                System.out.print(x[i][j] +" ");
            }
            System.out.println();
        }
    }
    private static void Afisare3(int[][]x, int z){
        for (int i = z-1; i>=0 ; i--) {
            for (int j = 0; j<z ; j++) {
                System.out.print(x[i][j] +" ");
            }
            System.out.println();
        }
    }
    private static void Afisare4(int[][]x, int z){
        for (int i = z-1; i>=0 ; i--) {
            for (int j = z-1; j>=0 ; j--) {
                System.out.print(x[i][j] +" ");
            }
            System.out.println();
        }
    }
}
