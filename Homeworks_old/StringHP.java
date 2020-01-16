package AllHomeworks.Homeworks_old;

import java.util.Scanner;

public class StringHP {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String message = "Happy Birthday ? !";
        System.out.println("Da-ti primul nume: ");
        String name1 = in.nextLine();
        System.out.println("Da-ti al doilea nume: ");
        String name2 = in.nextLine();
        System.out.println("Da-ti al trilea nume: ");
        String name3 = in.nextLine();
        System.out.println();
        Afisare(message, name1);
        Afisare(message, name2);
        Afisare(message, name3);
    }
    private static void Afisare(String n, String g){
        String m = n.substring(0,n.indexOf("?"));
        m=m.concat(g);
        System.out.println(m +"!");
    }
}
