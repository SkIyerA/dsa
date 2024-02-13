//find the first and last position of an element in a Sorted Array

import java.util.Arrays;
import java.util.Scanner;

public class FirstLastOccurance {
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
        int[] FirstLast = firstLast(arr, target);
        System.out.println(Arrays.toString(FirstLast));
    }

    static int[] firstLast(int[] nums, int target){
        int[] ans = {-1,-1};
        int first = FirstLastPosition(nums, target, true);
        int last = FirstLastPosition(nums, target, false);
        ans[0]=first;
        ans[1]=last;
        return ans;

    }
    static int FirstLastPosition(int[] arr,int target, boolean isFirst){
        //check for first occurrence
        int start =0;
        int end= arr.length-1;
        int ans= -1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start= mid +1;
            }else{
                ans= mid;          //this is the potential ans
                if(isFirst){
                    end = mid-1;    //binary search in lhs to find the first occurrence
                }else{
                    start=mid+1;    //binary search in rhs to find the last occurrence
                }
            }
        }
        return ans;
    }
}
