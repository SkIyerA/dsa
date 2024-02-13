import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the  number of rows");
        int n = in.nextInt();
        System.out.println("Pattern1 is");
        pattern1(n);
        System.out.println("Pattern2 is");
        pattern2(n);
        System.out.println("Pattern3 is");
        pattern3(n);
        System.out.println("Pattern4 is");
        pattern4(n);
        System.out.println("Pattern5 is");
        pattern5(n);
        System.out.println("Pattern6 is");
        pattern6(n);
        System.out.println("Pattern7 is");
        pattern7(n);
        System.out.println("Pattern8 is");
        pattern8(n);

    }


    static void pattern1(int n){
        for(int row=1;row<=n;row++){
            //for every row run the column
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        /*
        for(int row=n;row>=1;row--){
         */
        for(int row=1;row<=n;row++){
            /*
            for(int col=row;col>=1;col--){
             */
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    /*
    static void pattern5(int n){

        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=n-1;row>=1;row--){
            for(int col=row;col>=1;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    */

    static void pattern5(int n){
        for(int row=1;row<=2*n;row++){
            int totalColsInRow= row>n?2*n-row:row;
            for(int col=1;col<=totalColsInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++){
                System.out.print("  ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for(int row=1;row<=2*n;row++){
            int totalCol= row>n?2*n-row:row;
            for(int space=1;space<=n-totalCol;space++){
                System.out.print("  ");
            }
            for(int col=1;col<=totalCol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern8(int n){
        for(int row=1;row<=2*n;row++){
            int totalCol = row>n?2*n-row:row;
            for(int space=1;space<=n-totalCol;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=totalCol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
