import java.util.Arrays;
import java.util.Scanner;
//Bubble sort is the type of sort where adjacent elements are compared and swapped based on which is greater.
//After each iteration the maximum element is put at the last respective index
//the outer loop goes from 0 to arr.length-1
//the inner loop goes from 1 to arr.length-i-1. This is because after each iteration of the outerloop, max element comes to its last correct index
//so we need not check the last index
//for example when i=0, no elements are sorted. Therefore, j goes from 1 to arr.length-1; ie complete array
//when i=1, the max element in the array is put at the last position which is its correct position. Therefore there is no need to check it
//in the second iteration ie when i=1; Therefore j goes from 1 to arr.length-i-1. wiz arr.length-2
//Afer second iteration j goes from 1 to arr.length-2-1 =arr.length-3
//This goes on until i becomes equal to arr.length-1;
//But the loop is exited when for one iteration of the outer loop, no elements are swapped
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
        Bubble(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\n" + Arrays.toString(arr));

    }

    static void Bubble(int[] arr){
        boolean swapped;
        //run the steps (n-1) times
        for(int i=0;i<arr.length;i++){
            swapped=false;
            //for each step, max item will come at the last respective index
                for(int j=1; j<=arr.length-1-i;j++){
                    //swap if the item is smaller than the previous item
                    if(arr[j]<arr[j-1]){
                        int temp= arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                        swapped=true;
                    }
                }
            //if not swapped for a particular value of i, it means the array is sorted hence stop the program
            if(!swapped){ //!false=true;
                break;
            }
        }
    }
}
