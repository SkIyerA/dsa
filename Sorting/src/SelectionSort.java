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
        Selection(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\n" + Arrays.toString(arr));
    }


    static void Selection(int[] arr){
        //for every pass to put the max element in its correct index
        for(int i=0;i<arr.length;i++){
            //find the max item in the remaining array and swap with correct index
            int last= arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            Swap(arr,maxIndex,last);
        }

    }

    static void Swap(int[] arr,int maxIndex,int CrctIndex){
        int temp=arr[maxIndex];
        arr[maxIndex]=arr[CrctIndex];
        arr[CrctIndex]=temp;
    }

    private static int getMaxIndex(int[] arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
