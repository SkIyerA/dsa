package CyclicSortProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AllMissingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements to be sorted");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        ArrayList <Integer> Missing = new ArrayList<>();
        Missing = AllMissNumber(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n" + Arrays.toString(arr));
        System.out.println("The missing numbers are " + Missing);
    }

    public static ArrayList<Integer> AllMissNumber(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            int correct = arr[index] - 1;
            if (arr[index] <= arr.length && arr[correct] != arr[index]) {
                int temp = arr[index];
                arr[index] = arr[correct];
                arr[correct] = temp;
            }else{
                index++;
            }

        }
        ArrayList <Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                list.add(i+1);
            }
        }
        return list;
    }
}
