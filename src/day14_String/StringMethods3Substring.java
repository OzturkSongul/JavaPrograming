package day14_String;

public class StringMethods3Substring {
    public static void main(String[] args) {

        String word="Cydeo School";

        String brand= word.substring(0, 4);
        System.out.println("brand = " + brand);

        System.out.println("....................");
        String word2= "Python C# Ruby";

        String s1= word2.substring(0,word2.indexOf(" ") );
        System.out.println(s1);

        //Java
        String s2= word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" "));
        System.out.println(s2);

        String s3= word2.substring(word2.lastIndexOf(" ")+1);
        System.out.println(s3);//Language







    }
}
