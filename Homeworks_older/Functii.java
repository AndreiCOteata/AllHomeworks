package AllHomeworks.Homeworks_older;

import java.util.Scanner;

public class Functii {
    // Exercitiul 1
    public static void Afisare(int m, int n){
        for (int i = n; i <= m ; i++) {
            System.out.print(i + " ");
        }
    }
    public static void Afisare2(int m, int n){
        for (int i = m; i >= n ; i--) {
            System.out.print(i + " ");
        }
    }

    //Exercitiul 2
    public static void AfisarePare(int m){
        for (int i = 0; i < m; i++) {
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
    }

    //Exercitiul 3
    public static void AfisareImpare(int m){
        for (int i = 0; i < m; i++) {
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }
    }

    //Exercitiul 4
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
        } else{
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

    //Exercitiul 5
    public static void AfisareConditionala(int n, int m){
        Scanner myObJ = new Scanner(System.in);
        if(n>m) {
            System.out.println("Nr. n=" + n + " este mai mare decat m="+ m);
            Afisare(n,m);
        }else if(n<m){
            System.out.println("Nr. m=" + m + " este mai mare decat n="+ n);
            Afisare2(m,n);
        }else{
            System.out.println("Nr. sunt egale!");
            System.out.println("Da-ti o alta valoare lui n: ");
            n = myObJ.nextInt();
            System.out.println();
            System.out.println("Da-ti o alta valoare lui m: ");
            m = myObJ.nextInt();
            System.out.println();
            AfisareConditionala(n,m);
        }
    }

    //Exercitiul 6
    public static void TablaInmultirii(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n;j++){
                int h = i*j;
                System.out.print(i + "*" + j +"=" + h  + " ");
            }
            System.out.println(" ");
        }
    }

    //Exercitiul 7
    public static void TablaInmultirii2(int n){
        int i =1;
        int j =1;
        while(i<=n){
            while(j<=n){
                int h = i*j;
                System.out.print(i + "*" + j +"=" + h  + " ");
                j++;
            }
            j=0;
            i++;
            System.out.println(" ");
        }
    }

    //Exercitiul 8
    public static void Impartire(int n, int m){
        Scanner myObJ = new Scanner(System.in);
        boolean ab = true;
        while(ab){
            if(n>m){
                ab = false;
            }else{
                System.out.println("Alegeti alt numar mai mare ca " + m +"!");
                System.out.print("n= ");
                n = myObJ.nextInt();
            }
        }
        for (int i = 1; i <= n; i++) {
            if(i%m==0){
                System.out.println(i);
            }
        }
    }

    //Exercitiul 9
    public static void NrDivizibileCu3(int n){
        int i = n;
        while(i!=0){
            if(i%3==0){
                System.out.println(i);
            }
            i--;
        }
    }

    //Exercitiul 10
    public static void Afisare10(int n, int m){
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print("# ");
            }
            System.out.println();
            if(i%2!=0){
                System.out.print(" ");
            }
        }
    }
    //Exercitiul 11
    public static void Afisare11(int n){
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    //Exercitiul 12
    public static void Afisare12(int n){
        for (int i = 0; i <=n ; i++) {
            for (int j = n; j >=i ; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    //Exercitiul 13
    public static void Afisare13(int n){
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=n ; j++) {
                if(i==j) {
                    System.out.print("*");
                }
                else{ System.out.print("#");}
            }
            System.out.println(" ");
        }
    }

    //Exercitiul 14
    public static void Afisare14(int n){
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=n ; j++) {
                if(n==i+j+1) {
                    System.out.print("*");
                }
                else{ System.out.print("#");}
            }
            System.out.println(" ");
        }
    }

    //Exercitiul 15
    public static void Suma(int n){
        Scanner myObJ = new Scanner(System.in);
        boolean ab = true;
        int counter = n;
        while(ab){
            if(counter>=100){
                ab = false;
                System.out.println(counter);
            }
            else{
                System.out.println("Alegeti inca un numar!");
                System.out.print("m= ");
                n = myObJ.nextInt();
                counter=counter +n;
            }
        }
    }

    //Exercitiul 16
    public static void SumaCifrelor(long n){
        long nr = 0;
        while(n!=0){
            long r = n%10;
            n = n/10;
            nr = nr + r;
            System.out.print(r + "+");
        }
        System.out.println("= " +nr);
    }

    //Exercitiul 17
    public static void NrPar(int n){
        Scanner myObJ = new Scanner(System.in);
        boolean ab = true;
        while(ab){
            if(n%2==0){
                ab = false;
                System.out.println("Ati introdus, nr. "+n+"!");
            }
            else{
                System.out.println("Alegeti un numar par!");
                System.out.print("m= ");
                n = myObJ.nextInt();
            }
        }
    }
    //Exercitiul 18


    //Exercitiul 19
    public static double getRandomNumber(){
        double x = Math.random();
        return x;
    }
    public static void AfisareRandom(int n){
        for (int j = 0; j < n; j++) {
            double x = getRandomNumber();
            System.out.println(x);
        }
    }
}