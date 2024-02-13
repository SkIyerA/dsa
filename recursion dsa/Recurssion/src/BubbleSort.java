import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n= in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements to be sorted");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        Bubble(arr,n-1,0);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\n" + Arrays.toString(arr));
    }

    static void Bubble(int[] arr,int row, int col){
        if(row==0){
            for (int j : arr) {
                System.out.print(j+ " ");
            }
            System.out.println();
            return;
        }

        if(col<row){
            if(arr[col]>arr[col+1]){
                int temp=arr[col];
                arr[col]=arr[col+1];
                arr[col+1]=temp;
            }
            Bubble(arr, row,col+1);
        }else{
            Bubble(arr, row-1,0);
        }
    }
}
