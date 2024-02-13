package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String series = in.next();
        System.out.println(series);
        char[] arr = series.toCharArray();
        System.out.print(Arrays.toString(arr));

        int start=0;
        int end= arr.length-1;
        boolean isPalindrome = true;
        while(start<=end){
            if(arr[start]==arr[end]){
                start++;
                end--;

            }else{
                System.out.println("\nString not a palindrome");
                isPalindrome=false;
                break;
            }

        }
        if(isPalindrome){
            System.out.println(" \nString is a palindrome");
        }

        System.out.println("The claim that the string is not a palindrome is "+ isnotPalindrome(series));

    }



    static boolean isnotPalindrome(String series){
        if(series==null||series.length()==0){
            return true;
        }
        series= series.toLowerCase();
            for(int i=0;i<=series.length()/2;i++){
                char start = series.charAt(i);
                char end= series.charAt(series.length()-1-i);
                if(start!=end){
                    return true;
                }

            }
            return false;
        }
}
