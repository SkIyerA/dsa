import java.util.Scanner;

public class CountSteps {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        System.out.println(Steps(n,0));

    }

    public static int Steps(int n,int steps){
        if(n==0){
            return steps;
        }

        steps+=1;
        return Steps(n/10,steps);
    }
}
