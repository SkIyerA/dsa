import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        System.out.println(DigitSum(n));
        System.out.println(DigitProduct(n));
    }

    static int DigitSum(int n){
        if(n==0){
            return 0;
        }

        return n%10+DigitSum(n/10);
    }

    static int DigitProduct(int n){
        if(n==0){
            return 1;
        }

        return n%10 * DigitProduct(n/10);
    }


}
