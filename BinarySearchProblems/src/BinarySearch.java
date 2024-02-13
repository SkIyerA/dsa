import java.util.Scanner;

public class BinarySearch {
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
        int index = Binary(arr, target);
        System.out.println("The index of the target is " + index);
    }

    static int Binary(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end -start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(target<arr[mid]){
                end = mid-1;
            }else{
                start= mid+1;
            }
        }
        return -1;
    }

}
