//find the target element when the size of the given array is infinite
//solve without using array.length

import java.util.Scanner;

public class InfiniteArraySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n = in.nextInt();
        System.out.println("Enter the elements in Ascending Order");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the target to be found");
        int target = in.nextInt();
        int position = Ans(arr, target);
        System.out.println("The target is found in " + position + " position");

    }

    static int Ans(int[] arr, int target) {
        //first find the range
        //first start with box of size two and go ahead exponentially
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            //double the size of the box
            int newStart = end + 1;
            //end= previous end + (size of box) * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return Binary(arr, target, start, end);
    }

    static int Binary(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return target;
    }
}