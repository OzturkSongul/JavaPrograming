package day21_ForEachLoop;

import java.util.Arrays;

public class ArrayUtiliy2 {
    public static void main(String[] args) {

        String[]students={"Elif", "Gunay", "Sinem", "Cihad", "David", "James"};

        String [] earlyBird= Arrays.copyOf(students,3);

        System.out.println(Arrays.toString(earlyBird));


        System.out.println("......................");

        char[]ch1= {'a','b','c','d','e','f'};//I want copy that between 3 ile 5 element(including these element
        char[]ch2= Arrays.copyOfRange(ch1,2,6);

        System.out.println(Arrays.toString(ch2));


        System.out.println("...............");
        int[]scores={10,20,30,40,50,60,70,80,90,100};

        int[]result=Arrays.copyOfRange(scores,3,7);

        System.out.println(Arrays.toString(result));

        int[]result2=Arrays.copyOfRange(scores,4, scores.length);
        System.out.println(Arrays.toString(result2));
    }
}
