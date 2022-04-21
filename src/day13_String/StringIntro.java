package day13_String;

public class StringIntro {

    public static void main(String[] args) {
        String name="wooden spoon";
        String name2="wooden spoon";
        String name3= "wooden spoon";//there is only one wooden spoon in heap

        System.out.println(name==name2);

        System.out.println("..............");

        String object1= new String("Wooden Spoon");
        String object2= new String ("Wooden Spoon");
        String object3=new String("wooden spoon");//there are different object in heap

        System.out.println(object1==object2);

        System.out.println("................");

        String s1="java";
        String s2=new String("java");

        System.out.println(s1.equals(s2));//equal method

        String s3="Java";
        String s4=new String("java");

        System.out.println(s3.equals(s4));


        System.out.println(".................");
        String today= "I coded a lot of [java] today";
        //get me the word inside brackets using indexof and substaring methods

        String word= today.substring(today.indexOf("[")+1, today.indexOf("]"));
        System.out.println(word);

        System.out.println("...................");









    }
}
