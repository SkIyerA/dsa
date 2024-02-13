import java.util.Arrays;
import java.util.Scanner;

//cyclic sort is only for elements that is in order and it goes only from 1 to n, does not include 0
//suppose there are n elements in an array, and n=6.
//This means that the array contains elements 1,2,3,4,5,6 but not in the correct order
//so if the element is 3, we need to check if 3 is in the index 2.
//If it is not, then we swap 3 with the element which is in the 2nd index.
//if it is in the correct position, then increment i so that the next element can be checked
//this goes on until the index<arr.length

public class CyclicSort {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n= in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements to be sorted");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        Cyclic(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\n" + Arrays.toString(arr));
    }

    public static void Cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1; //4,3,1,2,5,6
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;

            }else{
                i++;
            }
        }
    }
}
