import java.util.Scanner;

public class ReverseNumberRec {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Digits(n));
    }

    //counting the number of digits
    /*public static int Count(int n,int count){
        if( n==0){
            return count;
        }
        count+=1;
        return Count(n/10,count);
    }
    public static int RevNum(int n){
        if(n%10==n){
            return n;
        }
        int count = 0;
        int arg=Count(n,count)-1;
        return (int)((n%10)*Math.pow(10,arg) + RevNum(n/10));
    }*/

    public static int RevNum(int n,int digits){
        if(n%10==n){
            return n;
        }

        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1)+RevNum(n/10,digits-1);
    }

    public static int Digits(int n){
        int count= (int)Math.log10(n)+1;
        return RevNum(n,count);
    }
}
