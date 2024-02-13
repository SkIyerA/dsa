//number of steps to reduce a number to 0, in one step if the current number is even, divide by 2,otherwise subtract 1 from it

import java.util.Scanner;

public class NumberOfSteps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        //System.out.println(CountSteps(n,0));
        System.out.println(CountSteps(n));
    }

   /* public static int CountSteps(int n,int steps){
        if(n==0){
            return steps;
        }

        if(n%2==0){
            return CountSteps(n/2,steps+1);
        }

        return CountSteps(n-1,steps+1);
    }*/

    public static int CountSteps(int n){
        return Helper(n,0);
    }

    private static int Helper(int n, int steps){
        if(n==0){
            return steps;
        }

        if(n%2==0){
            return Helper(n/2,steps+1);
        }

        return Helper(n-1,steps+1);

    }


}
