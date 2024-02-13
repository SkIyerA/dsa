import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n= in.nextInt();
        System.out.println("Enter the number of columns");
        int m= in.nextInt();
        Pattern1(n,m);
        Pattern2(n,m);


    }

    static void Pattern1(int row, int col){
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print("* ");
            Pattern1(row,col+1);
        }else{
            System.out.println();
            Pattern1(row-1,0);
        }

    }
    static void Pattern2(int row, int col){
        if(row==0){
            return;
        }
        if(col<row){
            Pattern2(row,col+1);
            System.out.print("* ");

        }else{
            Pattern2(row-1,0);
            System.out.println(" ");

        }

    }
}
