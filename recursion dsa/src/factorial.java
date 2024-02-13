import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number for which factorial needs to be found");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        //int fact=n;
        //int factt=factor(n,fact);
        //System.out.println(factt);
        System.out.println(factoria(n));


    }

   /* public static  int factor(int n,int fact){
        n-=1;
        if(n>0){
            fact= fact*n;
            return factor(n,fact);
        }
        return fact;
    }*/

    public static int factoria(int n){
        if(n<=1){
            return n;
        }
        return n* factoria(n-1);
    }
}
