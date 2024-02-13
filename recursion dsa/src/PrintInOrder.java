import java.util.Scanner;

public class PrintInOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        PrintNum(n);
    }
     static void PrintNum(int n){
            if(n==0){
                return;
            }
            PrintNum(--n); //first subtracts and then passes
            System.out.println(n+1); //the first passes value i.e n-1 is print at the last but we want to print till n. Hence print n+1.

     }
}
