import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n= in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements to be sorted");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        Quick(arr,0,arr.length-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\n" + Arrays.toString(arr));


    }

    static void Quick(int[] arr, int low, int high){
        if(low>=high){
            return;
        }

        int start= low;
        int end= high;
        int pivot = arr[start];

        while(start<=end){
            //this is also why if the array is already sorted it will not swap, hence preferred over merge sort

            while(arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }

            if(start<=end){
                int temp= arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        //since the pivot is now at the correct index, sort the lhs and the rhs through recursion call
        Quick(arr, low, end);
        Quick(arr, start, high);
    }
}
