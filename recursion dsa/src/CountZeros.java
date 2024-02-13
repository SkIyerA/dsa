import java.util.Scanner;

public class CountZeros {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        int count=0;
        System.out.println(Count(n,count));

    }

    public static int Count(int n,int count){
        if(n==0){
            return count;
        }

        int rem=n%10;
        if(rem==0){
            count++;
        }
        return Count(n/10,count);

    }
}
