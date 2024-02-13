package Strings;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a= 456.989f;
        //printf and println because we are formatting
        System.out.printf("Formatted number is %.2f \n", a); //%.2f is the placeholder
        System.out.printf("Pie:%.3f \n",Math.PI); //class Math has a constant variable PI

        //place the variables in the order of placeholders

        System.out.printf("My name is %s and I'm %d years old", "",23);

    }
}
