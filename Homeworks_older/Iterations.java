package AllHomeworks.Homeworks_older;

import java.util.Scanner;

public class Iterations {
    public static void main(String[] args) {

        String sir = "";
        Recursiv(sir);
    }

    private static void Recursiv(String H){
        Scanner myObj = new Scanner(System.in);
        H = myObj.nextLine();
        boolean h = H.equals("quit");
        while(h){
            if(h) {
                break;
            }
            else if(H.equals("continue")) {
                Recursiv(H);
            }else{
                    System.out.println(H);
                    H = myObj.nextLine();
                    h=H.equals("quit");
            }
        }
    }
}
