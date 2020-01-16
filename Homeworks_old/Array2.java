package AllHomeworks.Homeworks_old;

import java.util.Scanner;

public class Array2 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Da-ti dimensiunea vectorului: ");
        int dim = in.nextInt();
        int[] a = new int[dim];
        Citire(a,dim,0);
        System.out.println();
        Afisare(a,dim,0);
        System.out.println();
        System.out.print("Cititi minSum de la tastatura: ");
        int minSum = in.nextInt();
        int counter = Afisare2(a,dim,0,minSum);
        System.out.println();
        System.out.println("Suma este "+ counter+".");
    }
    private static void Citire(int[] x, int dim, int i){
        System.out.print("x["+i+"]=");
        x[i] = in.nextInt();
        if(i<dim-1){
            Citire(x,dim,i+1);
        }
    }
    private static void Afisare(int[] x, int dim, int i){
        System.out.print(x[i]+" ");
        if(i<dim-1){
            Afisare(x,dim,i+1);
        }
    }
    private static int Afisare2(int[] x, int dim, int i, int minSum){
        int counter = 0;
        counter = counter + x[i];
        if(counter>=minSum){
            System.out.println("Suma minima este mai mica decat prima valoare a vectorului!");
        }else{
            i++;
            while(counter<=minSum && i<dim-1) {
                System.out.print(x[i] + " ");
                counter = counter + x[i];
                i++;
            }
        }
        return counter;
    }

}
