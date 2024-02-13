package Strings; //character array but charAt shd be used to access individual characters in the string

public class stringProp {

    public static void main(String[] args) { //String args stores the command line arguments.
        int[] arr ={2,3,4,6};
        String name= "Akshata Iyer K S";
        System.out.println(name);
        String dog ="Akshata Iyer K S";
        System.out.println(name==dog);
        //here both the strings are pointing to the same object(unlike in arrays) because strings are stored in the heap in string pools
        dog= " Pikachoo";
        //in this case a new object is pointed to by dog
        //The value of the object pointed to by the reference variable name remains unchanged
        //string Objects are immutable for security reasons
        System.out.println(name==dog); //'=='-> checks for both the values and the reference variables i.e checks if both the ref variables are poining to the same objects

        //creating two objects of the same value not using string pool ie outside of string pool but inside the heap

        String name1 = new String("");
        String name2 = new String("");
        System.out.println(name1==name2);
        System.out.println(name1.equals(name2)); //equals is a method that cares not about the object but about the values inside the object
        System.out.println(name1.charAt(0));
    }
}
