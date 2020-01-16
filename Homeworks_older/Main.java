package AllHomeworks.Homeworks_older;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        //Exercitiul 1
        System.out.println("Exercitiul 1 ");
        System.out.println(" ");
        Functii.Afisare(100,0);
        System.out.println(" ");

        //Exercitiul 2
        System.out.println("Exercitiul 2 ");
        System.out.println(" ");
        Functii.AfisarePare(100);
        System.out.println(" ");

        //Exercitiul 3
        System.out.println("Exercitiul 3 ");
        System.out.println(" ");
        Functii.AfisareImpare(100);
        System.out.println(" ");

        //Exercitiul 4
        System.out.println("Exercitiul 4 ");
        System.out.println(" ");
        int a = 2;
        int b = 10;
        Functii.DiferentaAbsoluta(a,b);
        System.out.println(" ");

        //Exercitiul 5
        System.out.println("Exercitiul 5 ");
        System.out.println(" ");
        System.out.println("Afisare Conditionala! ");
        System.out.print("Primul numar: ");
        int n = myObj.nextInt();
        System.out.print("Al doilea numar: ");
        int m = myObj.nextInt();
        Functii.AfisareConditionala(n,m);
        System.out.println(" ");
        //Exercitiul 6
        System.out.println("Exercitiul 6 ");
        System.out.println(" ");
        Functii.TablaInmultirii(10);

        //Exercitiul 7
        System.out.println("Exercitiul 7 ");
        System.out.println(" ");
        Functii.TablaInmultirii2(10);
        //Exercitiul 8
        System.out.println("Exercitiul 8 ");
        System.out.println(" ");
        Functii.Impartire(n,m);
        //Exercitiul 9
        System.out.println("Exercitiul 9 ");
        System.out.println(" ");
        Functii.NrDivizibileCu3(n);

        //Exercitiul 10
        System.out.println("Exercitiul 10 ");
        System.out.println(" ");
        Functii.Afisare10(6,6);
        System.out.println(" ");

        //Exercitiul 11
        System.out.println("Exercitiul 11 ");
        System.out.println(" ");
        Functii.Afisare11(6);
        System.out.println(" ");

        //Exercitiul 12
        System.out.println("Exercitiul 12 ");
        System.out.println(" ");
        Functii.Afisare12(5);
        System.out.println(" ");

        //Exercitiul 13
        System.out.println("Exercitiul 13 ");
        System.out.println(" ");
        Functii.Afisare13(5);
        System.out.println(" ");

        //Exercitiul 14
        System.out.println("Exercitiul 14 ");
        System.out.println(" ");
        Functii.Afisare14(5);
        System.out.println(" ");

        //Exercitiul 15
        System.out.println("Exercitiul 15 ");
        System.out.println(" ");
        Functii.Suma(2); //am pus direct 2 pentru ca e mai simplu
        System.out.println(" ");

        //Exercitiul 16
        System.out.println("Exercitiul 16 ");
        System.out.println(" ");
        System.out.print("Tasteaza un nr imens: ");
        long g = myObj.nextLong();
        Functii.SumaCifrelor(g);
        System.out.println(" ");

        //Exercitiul 17
        System.out.println("Exercitiul 17 ");
        System.out.println(" ");
        System.out.print("Introduce-ti un numar par: ");
        int h = myObj.nextInt();
        Functii.NrPar(h);
        System.out.println(" ");

        //Exercitiul 18
        //Exercitiul 19
        System.out.println("Exercitiul 19 ");
        System.out.println(" ");
        Functii.AfisareRandom(3);
    }
}
