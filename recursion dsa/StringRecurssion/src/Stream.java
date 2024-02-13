//remove a particular character from the given string
import java.lang.System;
import java.util.Scanner;

import java.lang.String;
public class Stream {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the string");
        String up = in.nextLine();
        String p = new  String("");
        System.out.println("Enter the alphabet to be removed");
        char ch= in.next().charAt(0);
        System.out.println("Enter the string to be ignored");
        String stringIgnore= in.next();
        skip(p,up,ch);
        String processed=skip2(up,ch);
        System.out.println(processed);

        String processedd = skipString(up, stringIgnore);
        System.out.println(processedd);
    }


   //Skip a character
    static void skip(String p, String up,char alphabet){  //processed and unprocessed
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);
        if(ch==alphabet){
            skip(p,up.substring(1),alphabet);  //here we send the processed string in each recursion call
        }else{
            skip(p+ch,up.substring(1),alphabet);
        }
    }

    static String skip2(String up, char alphabet){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(ch==alphabet){
            return skip2(up.substring(1),alphabet);
        }else{
            return ch + skip2(up.substring(1),alphabet);  //here the values is returned after attaching the character to the string
        }

    }
    //skip a string if it's not the required string
    static String skipString(String up, String stringIgnore ){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith(stringIgnore)&& up.startsWith("apple")){
            return skipString(up.substring(stringIgnore.length()),stringIgnore);
        }else{
            return up.charAt(0)+ skipString(up.substring(1),stringIgnore);
        }
    }
}
