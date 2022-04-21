package day15ForLoop;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {
        String str="";
        boolean r= str.isEmpty();
        System.out.println(r);
        boolean r1=str.isBlank();
        System.out.println(r1);
        System.out.println("...........");
        String s1="CYDEO";
        String s2= "cydeo";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("................");
        String sentence= "My favorite programming language is Java";
        boolean hasCSharp=sentence.contains("C#");
        System.out.println(hasCSharp);
        boolean hasJava= sentence.contains("Java");
        System.out.println(hasJava);

        //how can we ignore case sensetitivy.

        boolean hasJava2= sentence.toLowerCase().contains("java");
        System.out.println(hasJava2);

        System.out.println(".................");

        String input1= "I love Java";
        String input2= "java";

        System.out.println(input1.equals(input2));//false
        System.out.println(input1.contains("java"));//false
        System.out.println(input1.toLowerCase().contains("java"));//TRUE
        System.out.println(input1.toUpperCase().contains("JAVA"));//true


        System.out.println("................");

        String str1= "Wooden Spoon";
        boolean x=str1.startsWith("Woo");
        boolean y= str1.endsWith("Spoon");
        boolean z= str1.toLowerCase().startsWith("wooden");

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);











    }
}
