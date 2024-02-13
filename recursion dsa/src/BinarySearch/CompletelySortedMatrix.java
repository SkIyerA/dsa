/*package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class CompletelySortedMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array");
        int n= in.nextInt();
        int m=in.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the elements inside the Array");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Enter the target element");
        int target= in.nextInt();
        System.out.println(Arrays.toString(BinarySearch(arr,target)));
    }

   /* static int[] BinarySearch(int[][] arr, int target){
        int row= 0;
        int col= arr.length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==target){
                return new int[]{row,col};
            }
            if(arr[row][col]<target){
                row++;
            }else{

            }
        }
    }
}*/
