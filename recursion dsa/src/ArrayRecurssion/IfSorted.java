package ArrayRecurssion;

import java.util.Scanner;

public class IfSorted {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n= in.nextInt();
        int[] Arr = new int[n];
        System.out.println("Enter "+ n + " Numbers");
        for( int i=0;i<n;i++){
            Arr[i]= in.nextInt();
        }
        System.out.println(IsSorted(Arr,0));
        System.out.println(HelperSorted(Arr));

    }

    public static boolean IsSorted(int[] Arr,int index){
        if(index == Arr.length-1){
            return true;
        }
        return Arr[index]<Arr[index+1] && IsSorted(Arr,index+1);

    }

    public static boolean HelperSorted(int[] Arr){
        return Helper(Arr,0);
    }

    public static boolean Helper(int[] Arr, int index){
        if(index==Arr.length-1){
            return true;
        }
        return Arr[index]<Arr[index+1]&& Helper(Arr,index+1);
    }
}
