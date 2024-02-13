import java.util.Scanner;

public class ReverseNumber {

    static int sum=0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        RevNum(n);
        System.out.println(sum);
    }

    static void RevNum(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        RevNum(n/10);

    }

}
