package Strings;

public class SBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder); //internally uses toString method to convert this StringBuilder object to string
        builder.reverse();
        System.out.println(builder);
    }
}
