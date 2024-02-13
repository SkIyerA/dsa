import java.util.Scanner;

public class PrintBoth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        PrintNum(n);
    }
    static void PrintNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        PrintNum(n-1);
        System.out.println(n);

    }
}
