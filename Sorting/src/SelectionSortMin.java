import java.util.Arrays;
import java.util.Scanner;

//Selection sort is the sort where you first select an element and then put it at its right position
//easy way to go about this is to either select the minimum element or the maximum element and put it at its right position
//If we are going with the minimum element, then first find the minimum element by searching from 0index to arr.length-1
//once you find the min element, then swap the element which is at 0th position with this min element
//This way the min element is put at its right position.
//Now increment the start by one. Now it goes from index1 to last index.


public class SelectionSortMin {
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

    private static void Selection(int[] arr){
        for(int i=0;i<arr.length;i++){

            int last= arr.length;
            int minIndex=MinIndex(arr,i,last);
            Swap(arr,minIndex,i);

        }
    }

    private static void Swap(int[] arr, int minIndex, int CrctIndex){
        int temp=arr[minIndex];
        arr[minIndex]=arr[CrctIndex];
        arr[CrctIndex]=temp;
    }

    private static int MinIndex(int[] arr,int start,int end){
        int min=start;
        for(int i=start;i<end;i++){
            if(arr[min]>arr[i]){
                min=i;
            }
        }
        return min;
    }
}
