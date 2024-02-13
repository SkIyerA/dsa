//Ceiling-> return the smallest number greater than or equal to the target

import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n = in.nextInt();
        System.out.println("Enter the elements in Ascending Order");
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the target to be found");
        int target = in.nextInt();
        int ceil = CeilBinary(arr, target);
        System.out.println("The ceil is " + ceil);
    }

    static int CeilBinary(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        if(target>arr[end]||target<arr[start]){
            return -1;
        }
        while(start<=end){
            int mid = start + (end -start)/2;
            if(arr[mid]==target){
                return arr[mid]; // remove this if condition when the ceil of the target is asked and not the target itself
            }else if(target<arr[mid]){
                end = mid-1;
            }else{
                start= mid+1;
            }
        }
        //when while loop breaks, start=end+1
        return arr[start];
    }
}
