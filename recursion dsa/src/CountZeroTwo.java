import java.util.Scanner;

public class CountZeroTwo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Count(n));

    }

    public static int Count(int n) {
        return helper(n, 0);
    }

    public static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, c + 1);
        }
        return helper(n / 10,c);
    }
}
