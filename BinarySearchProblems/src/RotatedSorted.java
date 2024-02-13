//Rotated Sorted Array with no duplicates

import java.util.Scanner;

public class RotatedSorted {
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
        int index = Pivot(arr, target);
        System.out.println("The index of the target is " + index);
    }

    static int Pivot(int[] nums,int target){
        int start=0;
        int end= nums.length-1;
        while(start<=end){
            int mid= start + (end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return call(nums, target, nums[mid]);
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return call(nums, target, nums[mid-1]);
            }
            if (nums[start]>=nums[mid]) {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return call(nums, target, -1);
    }

    static int Binary(int[] arr, int target, int start, int end){
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

    static int call(int[] arr, int target, int peak){
        if(peak == -1){
            return Binary(arr, target, 0, arr.length-1);
        }
        int left=Binary(arr, target, 0, peak);
        int right= Binary(arr, target, peak+1,arr.length-1);
        if(left!=-1){
            return left;
        }else return right;
    }
}
