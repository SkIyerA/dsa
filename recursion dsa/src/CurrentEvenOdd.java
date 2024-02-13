//if the current number is even, divide it by 2, otherwise subtract 1 from it

import java.util.Scanner;


public class CurrentEvenOdd {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        int steps=0;
        System.out.println(OddEven(n,steps));

    }

    public static int OddEven(int n,int steps){
        if(n==0){
            return steps;
        }
        if (n%2==0){
            return OddEven(n/2, steps+1);
        }else{
            return OddEven(n-1,steps+1);
        }
    }
}
