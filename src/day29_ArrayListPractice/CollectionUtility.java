package day29_ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4));
        Collections.sort(list);

        System.out.println(list);

        System.out.println(".................");
        ArrayList<Character>list2= new ArrayList<>();
        list2.addAll(Arrays.asList('A','B','C','D'));

        System.out.println(list2);
        Collections.reverse(list2);
        System.out.println(list2);

        System.out.println("................");

        ArrayList<Integer>list3=new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40));

        Collections.swap(list3, 2,3);// in swap method index number2 ile index number3 will change

        System.out.println(list3);

        System.out.println(".....................");
        int max= Collections.max(list3);
        int min= Collections.min(list3);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("..............");

        ArrayList<Integer>list4= new ArrayList<>();

        list4.addAll (Arrays.asList(10,10,20,30,40,50,10,10,10));
        Collections.replaceAll(list4, 10,1000);
        System.out.println(list4);

        int frequency=Collections.frequency(list4, 1000);
        System.out.println("frequency = " + frequency);

        ArrayList<String>words=new ArrayList<>();
        words.addAll(Arrays.asList("java", "java", "Ruby"));

        int countJava= Collections.frequency(words,"java");
        int ruby= Collections.frequency(words, "Ruby");

        System.out.println("countJava = " + countJava);
        System.out.println("ruby = " + ruby);





    }
}
