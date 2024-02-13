//search for the target in a Mountain array
//No duplicates

import java.util.Scanner;

public class MountainSearch {

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
        int Position= Peak(arr, target);
        System.out.println("The position of the target is" + Position);
    }


    static int Peak(int[] mountainArr,int target){
        int start=0;
        int end=mountainArr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(mountainArr[mid]<mountainArr[mid+1]){
                start=mid+1;
            }else{
                end=mid;
            }

        }
        int left = Binary(mountainArr, target, 0, end );
        int right = OrderAgnosticBinary(mountainArr, target, start+1, mountainArr.length-1 );
        if(left!=-1){
            return left;
        }else if(right!=-1){
            return right;
        }
        return -1;
    }

    static int Binary(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end -start)/2;
            if(arr[mid]==target){
                return mid+1;
            }else if(target<arr[mid]){
                end = mid-1;
            }else{
                start= mid+1;
            }
        }
        return -1;

    }

    static int OrderAgnosticBinary(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid + 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
