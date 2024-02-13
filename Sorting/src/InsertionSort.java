import java.util.Arrays;
import java.util.Scanner;

//Insertion sort is the kind of sort where initially first two elements are put in their correct position
//for example if we are sorting in an Ascending order, if the first element is 4 and the second element is 2, we put 2
//in the first index and 4 in the second index.
//use the inner loop for putting elements in the right position, the inner loop goes from i+1 position to 0
//use the outer loop for the number of elements to be sorted in one loop
// for example in the first iteration of the outer loop first 2 elements are sorted, in the next loop, first 3 elements are sorted and so on
//outer loop goes from 0 to last but one element index ie arr.length-2
public class InsertionSort {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n= in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements to be sorted");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        Insertion(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\n" + Arrays.toString(arr));
    }

    private static void Insertion(int[] arr){
        for(int i=0;i<=arr.length-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j] =arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
    }
}
