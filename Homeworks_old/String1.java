package AllHomeworks.Homeworks_old;

import java.util.Scanner;

public class String1 {
    private static Scanner in = new Scanner(System.in);
    private static char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    public static void main(String[] args) {
        System.out.println("Scrie ceva, orice: ");
        String sir = in.nextLine();
        Afisare(sir);
        System.out.println();
        Afisare2(sir);
        System.out.println();
        Afisare3(sir);
        System.out.println();
        count(sir);
    }
    private static void Afisare(String x){
        for (int i = 0; i < x.length() ; i++) {
            System.out.println(x.charAt(i));
        }
    }
    private static void Afisare2(String x){
        for (int i = 0; i < x.length() ; i++) {
            System.out.println((int)x.charAt(i));
        }
    }
    private static void Afisare3(String x){
        for (int j = x.length()-1; j>=0; j--) {
            System.out.print(x.charAt(j));
        }
    }
    private static void count(String x){
        char[] ch = x.toCharArray();
        int letterv = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        for (int j = 0; j<x.length(); j++) {
            if(Character.isLetter(ch[j])){
                for (int i = 0; i < vowels.length; i++) {
                    if(ch[j]==vowels[i]){
                        letterv ++;
                    }
                }
            }else if(Character.isDigit(ch[j])){
                num ++;
            }else if(Character.isSpaceChar(ch[j])){
                space ++;
            }else{
                other++;
            }
        }
        int letterc = x.length() - letterv - num - other - space;
        System.out.println("Sirul de caractere contine: "+ letterv + " vocale!");
        System.out.println("Sirul de caractere contine: "+ letterc + " consoane!");
        System.out.println("Sirul de caractere contine: "+ num + " digits!");
        System.out.println("Sirul de caractere contine: "+ other + " caractere speciale!");
        System.out.println("Sirul de caractere contine: "+ space + " spatii!");
    }
}
