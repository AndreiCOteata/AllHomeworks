package AllHomeworks.Homeworks_old;

import java.util.Scanner;

import static java.lang.Math.random;

public class Bomboane{
    private static Scanner in = new Scanner(System.in);
    private static final int Copii = 10;
    private static int[] gradinita = new int[Copii];
    private static final int range = 5;
    private static final int min = 1;
    public static void main(String[] args) {
        Citire(gradinita);
        System.out.println("Gradinita si bomboanele fiecaruia:");
        Afisare(gradinita,0);
        System.out.println();
        System.out.println("Gradinita dupa ce au mancat cate o bomboana si bomboanele fiecaruia:");
        eat1Candy(gradinita);
        System.out.println("Everyone gets candies!!!");
        roundAndRoundWeGo(gradinita, 1);
    }
    private static void Citire(int[] a){
        for (int i = 0; i < Copii ; i++) {
            a[i] = (int)(random()*range) + min;
        }
    }
    private static void Afisare(int[] x, int i){
        System.out.print("copilul["+i+"]= "+ x[i]+" ");
        if(i<Copii-1){
            Afisare(x,i+1);
        }
    }
    private static void eat1Candy(int[] x){
        for (int i = 0; i < Copii ; i++) {
            x[i] = x[i] - 1;
            System.out.print("copilul["+i+"]= "+ x[i]+" ");
        }
    }
    private static void getRandomCandies(int[] x){
        for (int i = 0; i < Copii ; i++) {
            if(x[i]%2 == 0){
                x[i] = x[i] + (int)(random()*3+1);
            }else{
                x[i] = x[i] + (int)(random()*2+1);
            }
        }
    }
    private static void roundAndRoundWeGo(int[] x, int min){
        System.out.println();
        System.out.print("Tour number " + min + ": ");
        getRandomCandies(x);
        Afisare(gradinita,0);
        if(!validationOfCandies(x)){
            roundAndRoundWeGo(x,min +1);
        }
    }
    private static boolean validationOfCandies(int[] x){
        int counter = 0;
        for (int i = 0; i <Copii ; i++) {
            if(x[i]>=15){
                counter++;
                if(counter==Copii){
                    return true;
                }
            }
        }
        return false;
    }
}
