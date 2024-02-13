package Strings;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        //out is a variable of type PrintStream(is a class) which has a method println
        System.out.println(56);   //Internally uses Integer.toString(56)
        System.out.println("");
        System.out.println(new int[]{1,2,3,4,5,6,}); //print an object which can be of any types(valueOf and  obj.toString)
        //this prints a random value
        //all these are the example of function overloading.
        //anything passed as an argument in println, is converted to Strings using the toString method


        System.out.println(Arrays.toString(new int[]{1,2,3,4,5,6,})); //this makes use of the Arrays' toString method instead of the default one.  This is method Overriding
        //does not give random values //here the method obj.toString is overridden by the method Arrays.toString
        String name=null;
        System.out.println(name);

        //for String and object first the .valueOf method is called and then the obj.toString Method if the value is not null
        Integer num = new Integer(56);  //wrapper class
        //System.out.println(num.toString()); //here the toString method is not needed because java by default converts num to string
        System.out.println(num);

        //wrapper class objects stores in heap and not in stack unlike primitive values. By putting in wrapper class, the oop concepts can be applied

    }
}
