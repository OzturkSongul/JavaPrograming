package day21_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagrom {//one of the interwiev question
    public static void main(String[] args) {

        String str1= "acdb";
        String str2= "dcba";

        char[] ch1 =str1.toCharArray();//we couldnt sort method for String so we need to create array
        char[] ch2= str2.toCharArray();

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        Arrays.sort(ch1);//to look at if two array have same charater we use sort method
        Arrays.sort(ch2);
        System.out.println();

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean anagram= Arrays.equals(ch1,ch2);
        System.out.println(anagram);

        System.out.println("..............");

        String sentence="Wooden Sppon";

        String[] words=sentence.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("...............");

        String email="woodenspoon@gmail.com";
        String[] arry= email.split("@");
        System.out.println(Arrays.toString(arry));

        System.out.println(".................");

        String s= "Today is nice day.Today is Monday.Today we learn Java";
        String[]sentences=s.split("\\.");//when we use . for splitting slash charater is using

        System.out.println(Arrays.toString(sentences));





    }
}
