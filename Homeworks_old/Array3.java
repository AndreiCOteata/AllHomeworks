package AllHomeworks.Homeworks_old;

public class Array3 {
    public static void main(String[] args) {
        int[] a = new int[]{56, 93, 12, 31};
        int[] b = new int[]{17, 37, 12, 31, 48, 12, 93, 5, 63, 68};
        primaAparitie(a,b);
        System.out.println();
        ultimaAparitie(a,b);
    }
    private static void primaAparitie(int[] x, int[] y){
        for (int i = 0; i <x.length ; i++) {
            boolean input = true;
            int j = 0;
            while(j<y.length && input){
                if(x[i]==y[j]){
                    System.out.println(x[i] + " la index " + j);
                    input = false;
                }else if(j==y.length-1){
                    System.out.println(x[i] + " nu este prezent in al doilea vector!");
                }
                j++;
            }
        }
    }
    private static void ultimaAparitie(int[] x, int[] y){
        for(int i = 0; i<x.length ; i++) {
            boolean input = true;
            int j = y.length -1;
            while(j>=0 && input){
                if(x[i]==y[j]){
                    System.out.println(x[i] + " la index " + j);
                    input = false;
                }else if(j==0){
                    System.out.println(x[i] + " nu este prezent in al doilea vector!");
                }
                j--;
            }
        }
    }
}
