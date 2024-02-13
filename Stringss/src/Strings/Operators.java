package Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b'); //character ascii value addition
        System.out.println("a"+"b"); //string concatenation "a" + "b" gives a new object "ab" which is stores in the memory. The values "a" and"b" since is not stored in the memory is collected by the garbage collector
        System.out.println('a'+3);
        System.out.println((char)('a'+3)); //type casting-> the output remains a character
        System.out.println("a"+1);
        //when integer is added with a string then that integer is converted to its wrapper class which calls the obj.toStrings method.a1 is the output
        System.out.println("" + new ArrayList<>());
        //toString of ArrayList, since the list here is empty returns an empty list.
        System.out.println("" + new Integer(23)); //calls toString for the wrapper class object

        /* xxxx System.out.println(new Integer(67)+ new ArrayList<>());   does not work because '+' operator only works for primitives
        or for complex objects only when at least one of the values is a string. This can problem can be solved by adding an empty string
         */
        System.out.println(new Integer(67)+" " + new ArrayList<>());
        System.out.println(1+2);

        //the additional functionality(concatenation)of the operator '+' that java provides is called operator overloading
        /*in java, Operator overloading of the + operator is only in case of Strings. Java does not allow Operator Overloading. Exception
        is only in case of '+' when the string is to be concatenated.This is default. Manual changing is not possible unlike c++ and python         */

        System.out.println("a"+ 'b');  //string + a character array becomes string

    }
}
