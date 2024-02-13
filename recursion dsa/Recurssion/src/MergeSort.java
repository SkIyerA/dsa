import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n= in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements to be sorted");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int[] sortedArray = MergeSort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\n" + Arrays.toString(sortedArray));
    }

    static int[] MergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid= arr.length/2;
        int[] left = MergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right= MergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return Merge(left,right);

    }

    private static int[] Merge(int[] left, int[] right){
        int[] mix = new int[left.length +  right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length&& j<right.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of these arrays may not be complete
        //so copy the remaining elements
        while(i<left.length){
            mix[k]=left[i];
            i++;
            k++;
        }

        while(j<right.length){
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;
    }
}
