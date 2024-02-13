import java.util.Arrays;
import java.util.Scanner;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n= in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements to be sorted");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        MergeSort(arr,0,arr.length);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\n" + Arrays.toString(arr));
    }

    static void MergeSort(int[] arr,int start,int end){
        if(end-start==1){
            return;
        }

        int mid= start +(end-start)/2;
        MergeSort(arr,start,mid);
        MergeSort(arr,mid,end);
        MergeInPlace(arr,start,mid,end);
    }

    static void MergeInPlace(int[] arr, int start, int mid,int end){
        int[] mix = new int[end-start];
        int i=start;
        int j=mid;
        int k=0;
        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }

        while(j<end){
            mix[k]=arr[j];
            j++;
            k++;
        }
        System.arraycopy(mix, 0, arr, start + 0, mix.length);
    }
}
