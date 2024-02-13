package CyclicSortProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements to be sorted");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        ArrayList<Integer> Missing = new ArrayList<>();
        Missing = Duplicate(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n" + Arrays.toString(arr));
        System.out.println("The missing numbers are " + Missing);
    }
    static ArrayList<Integer> Duplicate(int[] arr){
        return new ArrayList<>();
    }
}
