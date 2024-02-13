package Strings;

public class Performance {
    public static void main(String[] args) {
        String series="";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            System.out.println(ch);
            series = series +ch;  //string + character gives a string
        /*since string is immutable in each step new String object is created and the old ones is discarded by the garbage collector
        resulting in memory wastage.O(n2) complexity
         */
        }
        System.out.println(series); //
    }
}
