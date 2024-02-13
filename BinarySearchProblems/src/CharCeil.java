//find the ceil of the target character and if no character is larger than the target, then return thr first smallest character in the array
// the letters wrap around

import java.util.Scanner;

public class CharCeil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n = in.nextInt();
        System.out.println("Enter the elements in Ascending Order");
        char[] arr= new char[n];
        for(int i=0;i<n;i++){
            char c = in.next().charAt(0);
            arr[i] = c;
        }
        System.out.println("Enter the target to be found");
        char target = in.next().charAt(0);
        char ceil = CeilBinary(arr, target);
        System.out.println("The ceil is " + ceil);
        System.out.println(3%4);
    }


    static char CeilBinary(char[] arr, char target){
        int start = 0;
        int end= arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }else{
                start= mid+1;
            }
        }
        return arr[start%arr.length];
    }
}
