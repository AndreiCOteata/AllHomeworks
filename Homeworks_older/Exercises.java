package AllHomeworks.Homeworks_older;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        int a =2_147_483_647;
        System.out.println(a);
        a+=1;
        System.out.println(a);
        a+=1;
        System.out.println(a);

        double b = 3.23523;
        double i =1;
        System.out.println(b);
        double v = Math.round((b * i) * 100.0) / 100.0;
        System.out.println(v);
        //DecimalFormat format = new DecimalFormat("##.00");
        //System.out.println(format.format(b));
        int q = 192;
        int w= 168;
        int e = 1;
        int r = 10;
        System.out.printf("%x:%x:%x:%x", q, w, e, r);
        System.out.println(" ");
        String S = "abc";
        System.out.println(S.toUpperCase());
        String sirdecaractere = "Lorem ipsum dolor sit amet , consectetur adipiscing elit.";
        System.out.println(sirdecaractere.toUpperCase());
        System.out.println(sirdecaractere.toLowerCase());
        System.out.println(sirdecaractere.replace("o","z"));
        boolean j = sirdecaractere.endsWith("elit");
        System.out.println(j);
        String C ="abc";
        String N = new String("abc");
        System.out.println(S==C);
        System.out.println(S.equals(C));

        Scanner myObj = new Scanner(System.in);
        String sir = myObj.next();
        System.out.println(sir);
        switch (sir){
            case "star" :
                System.out.println("*");
                break;
            case "display" :
                System.out.println("$");
                break;
            case "second":
                System.out.println("^");
                break;
            default:
                System.out.println("wrong one");
        }
        int t = 5;
        while(t!=0){
            System.out.println("Andrei");
            t--;
        }
        int k = sir.length() -1;
        String reverse = "";
        while(k>=0){
            reverse = reverse + sir.charAt(k);
            k--;
            System.out.println(reverse);
        }
        System.out.println(reverse);
        int l = reverse.length()-1;
        String reverse2 = "";
        do {
            reverse2 = reverse2 + reverse.charAt(l);
            System.out.println(reverse2);
            l--;
        } while(l>=0);
        System.out.println(reverse2);
    }
}
