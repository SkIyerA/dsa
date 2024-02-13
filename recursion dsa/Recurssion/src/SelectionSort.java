import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n= in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements to be sorted");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        Selection(arr,n-1,0, 0);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\n" + Arrays.toString(arr));
    }

    static void Selection(int[] arr, int row, int col,int max){
        if(row==1){
            for(int j:arr){
                System.out.print(j+ " ");
            }
            System.out.println();
            return;
        }

        if(col<row+1){
            if(arr[max]<arr[col]){
                max=col;
                Selection(arr,row,col+1,max);
            }else {
                Selection(arr, row, col + 1, max);
            }
        }else {
            int temp = arr[max];
            arr[max] = arr[row];
            arr[row] = temp;
            Selection(arr,row-1,0, 0);
        }

    }
}

