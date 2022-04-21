package day14_String;

public class stringMethod1 {
    public static void main(String[] args) {
        String str1="   batch 25    ";
        str1=str1.trim();
        System.out.println(str1);

        System.out.println(".............");

        String str2= "Cydeo School";
        int n1 =str2.indexOf("h");
        System.out.println("n1 = " + n1);

      int n2=  str2.indexOf("o");
        System.out.println("n2 = " + n2);

        int n3= str2.indexOf("ool");
        System.out.println("n3 = " + n3);

        String str3= "Java Programming Language";
        int n4= str3.indexOf("a ");
        System.out.println("n4 = " + n4);

        int n5=str3.indexOf("amm");
        System.out.println("n5 = " + n5);

        int n6=str3.indexOf("an");
        System.out.println("n6 = " + n6);

        int n7= str3.indexOf("g");
        System.out.println("n7 = " + n7);

        int n8= str3.indexOf("g ");
        System.out.println("n8 = " + n8);

        int n9= str3.indexOf("gua");
        System.out.println("n9 = " + n9);

        int n10= str3.lastIndexOf("g");
        System.out.println("n10 = " + n10);
        System.out.println("'''''''''");

        String s= "Java Nova Cava Wawa orange";

        int firstA= s.indexOf("a");
        System.out.println("firstA = " + firstA);
        int secondA= s.indexOf("a ");
        System.out.println("secondA = " + secondA);
        int lastA= s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);

        int thirdA= s.indexOf("a C");
        System.out.println("thirdA = " + thirdA);

        //int fourthA= s.indexOf("ava W");
        int fourthA= s.lastIndexOf("av");
        System.out.println("fourthA = " + fourthA);

        int fifthA= s.lastIndexOf("");






    }
}
