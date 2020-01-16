package AllHomeworks.Homeworks_older;

import java.util.Scanner;

public class EE {
    public static void main(String[] args) {
        Scanner myObJ = new Scanner(System.in);
        System.out.println("Da-ti o valoare lui a: ");
        int a = myObJ.nextInt();
        System.out.println();
        System.out.println("Da-ti o valoare lui b: ");
        int b = myObJ.nextInt();
        System.out.println();
        DiferentaAbsoluta(a,b);
    }

    public static void DiferentaAbsoluta(int a, int b){
        Scanner myObJ = new Scanner(System.in);
        int dif = a-b;
        if(dif>0){
            System.out.println("Diferenta absoluta este: "+ dif);
            Afisare3(dif,1);
        }else if(dif<0){
            int h = (-1)*dif;
            System.out.println("Diferenta absoluta este: "+ h);
            Afisare3(h,1);
        } else {
            System.out.println("Diferenta este egala cu 0;");
            System.out.println("Da-ti o alta valoare lui a: ");
            a = myObJ.nextInt();
            System.out.println();
            System.out.println("Da-ti o alta valoare lui b: ");
            b = myObJ.nextInt();
            System.out.println();
            DiferentaAbsoluta(a,b);
        }
    }
    public static void Afisare3(int m, int n){
        for (int i = n; i <= m ; i++) {
            System.out.print("* ");
        }
    }
}
