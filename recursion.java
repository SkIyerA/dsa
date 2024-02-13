import java.util.Scanner;

public class recursion {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        print1(n);

    }
    public static void print1(int n){
            System.out.println(n);
            n-=1;
            if(n>0){
                print1(n);
            }
            return;

    }
}
