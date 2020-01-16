package AllHomeworks.Homeworks_old;

import java.util.Scanner;

public class Array4 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Da-ti dimensiunea vectorului: ");
        int dim = in.nextInt();
        int[] a = new int[dim];
        Citire(a,dim,0);
        System.out.println();
        System.out.println("Afisare Matrice!");
        Afisare(a,dim,0);
        System.out.println();
        System.out.println("Value has a twin on his right!");
        Parcurgere(a);
        System.out.println();
        System.out.println("Now there's 2 of it. JK, 2 rows");
        halfOfit(a);
        System.out.println();
        System.out.println("Prime values");
        valueIsPrime(a);
        System.out.println();
        System.out.println("The difference between a value and the one right next to it.");
        diferenta(a);
        System.out.println();
        System.out.println("Sorting by value");
        sortByValue(a);
    }
    public static void Citire(int[] x, int dim, int i){
        System.out.print("x["+i+"]=");
        x[i] = in.nextInt();
        if(i<dim-1){
            Citire(x,dim,i+1);
        }
    }
    public static void Afisare(int[] x, int dim, int i){
        System.out.print(x[i]+" ");
        if(i<dim-1){
            Afisare(x,dim,i+1);
        }
    }
    public static void Parcurgere(int[] x){
        for (int i = 0; i <x.length ; i++) {
            boolean input = true;
            int j=i+1;
            while(j<x.length && input){
                if(x[i]==x[j]){
                    System.out.println(x[i] + " - " + true );
                    input = false;
                }else if(j==x.length-1){
                    System.out.println(x[i] + " - " + false);
                }
                j++;
            }
            if(i==x.length-1){
                System.out.println(x[i] + " - " + false);
            }
        }
    }
    //Array5
    public static void halfOfit(int[] x){
        int i = 0;
        while(i<x.length){
            if(i<x.length/2){
                System.out.print(x[i] + " ");
            }else if(i==x.length/2){
                System.out.print(x[i]);
                System.out.println();
            }else{
                System.out.print(x[i] + " ");
            }
            i++;
        }
    }
    //Array6
    public static void valueIsPrime(int[]x){
        for (int i = 0; i < x.length; i++) {
            if(isPrime(x[i])){
                System.out.print(x[i]+ " ");
            }
        }
    }
    public static boolean isPrime(int a){
        int sqrt = a/2;
        for(int i = 2; i<=sqrt; i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    //Array7
    public static void diferenta(int[] x){
        for (int i = 1; i <x.length ; i++) {
            int dif = 0;
            dif = x[i-1] - x[i];
            System.out.print(dif +" ");
        }
    }
    //Array8
    public static void sortByValue(int[] x){
        System.out.print(x[0]+ " ");
        for (int i = 1; i <x.length ; i++) {
            if(x[i-1]<=x[i]){
                System.out.print(x[i]+" ");
            }else{
                System.out.println();
                System.out.print(x[i]+" ");
            }
        }
    }
}
