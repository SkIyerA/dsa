import java.util.*;
public class recur {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int num=1;
        print1(num,n);
    }
    public static void print1(int num,int n){
        System.out.println(num);
        num+=1;
        if(num>n){
            return;
        }
        print1(num,n);
    }
}
