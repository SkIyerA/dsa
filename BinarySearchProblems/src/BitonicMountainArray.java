
// A bi-tonic or mountain array is an array which first increases, reaches a peak and then decreases.

//find the peak in a Mountain array which does not contain any duplicate elements

//Has not duplicates


import java.util.Scanner;

public class BitonicMountainArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n = in.nextInt();
        System.out.println("Enter the elements in Ascending Order");
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int peak = Mountain(arr);
        int secondway = AnotherWay(arr);
        System.out.println("The peak is " + peak);
        System.out.println("The peak is at the index "+ secondway);

    }

    static int Mountain(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]&& arr[mid]>arr[mid-1]){
                return arr[mid];
            }else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }else{
                end=mid-1;
            }

        }
        return -1;
    }

    static int AnotherWay(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;  //because the middle element can not be the peak so don't include it
            }else{
                end=mid;     //here the middle element is greater than the previous element, so it could be the peak. Therefore, it should be included for the next iteration
            }
            //when the start index becomes equal to the end index, then the while loop terminates and the element in this particular index is the peak.
        }
        return start; // return start or end,it does not matter because both are at the same position of the index
    }

}
