package AllHomeworks.Homeworks_old;

import java.util.Scanner;
public class Array1 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Da-ti dimensiunea vectorului: ");
        int dim = in.nextInt();
        int[] a = new int[dim];
        Citire(a,dim,0);
        System.out.println();
        Afisare(a,dim,0);
        System.out.println();
        AfisareIndexImpar(a,dim,0);
        System.out.println();
        AfisareImpare(a,dim,0);
        System.out.println();
        int sum=Suma(a,dim);
        System.out.println(sum);
        int media=sum/dim;
        System.out.println(media);
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
    public static void AfisareIndexImpar(int[] x, int dim, int i){
        if(i%2!=0){
            System.out.print(i+" ");
        }
        if(i<dim-1){
            AfisareIndexImpar(x,dim,i+1);
        }
    }
    public static void AfisareImpare(int[] x, int dim, int i){
        if(x[i]%2!=0){
            System.out.print(x[i]+" ");
        }
        if(i<dim-1){
            AfisareImpare(x,dim,i+1);
        }
    }
    public static int Suma(int[] x, int dim){
        int sum = 0;
        for (int i = 0; i <dim ; i++) {
            sum=sum+x[i];
        }
        return sum;
    }
}
