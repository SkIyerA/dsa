import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(Digits(n)==n){
            System.out.println("The number "+n+ " is a palindrome");
        }else{
            System.out.println("The number "+n+ " is not a palindrome");
        }
    }

    public static int RevNum(int n,int digits){
        if(n%10==n){
            return n;
        }

        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1)+RevNum(n/10,digits-1);
    }

    public static int Digits(int n) {
        int count = (int) Math.log10(n) + 1;
        return RevNum(n, count);
    }

}
