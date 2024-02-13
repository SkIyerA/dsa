package Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String Name= "  Akshata Iyer K S";
        System.out.println(Arrays.toString(Name.toCharArray()));
        System.out.println(Name.toCharArray());
        System.out.println(Name.toLowerCase());
        System.out.println(Name);
        System.out.println(Name.toUpperCase());
        System.out.println(Name.indexOf('a'));
        System.out.println(Name.lastIndexOf('a'));
        System.out.println(Name.strip());
        System.out.println(Arrays.toString(Name.split(" ")));
    }
}
