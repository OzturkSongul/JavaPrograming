package day21_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayUtilitiy {
    public static void main(String[] args) {

        int[]numbers={1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[0]);
        System.out.println("..................");

        int[]scores={95,100,78,65};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("min score : "+ scores[0]);
        System.out.println("max score: " + scores[scores.length-1]);
        String []names= {"Anna", "Gunay", "Zuhal", "Ahmet"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));


        String[]words= {"Anna", "ANNA"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        System.out.println("................");

        int[]array1={1,3,2};
        int[]array2={1,2,3};

        boolean r1= Arrays.equals(array1,array2);
        System.out.println(r1);

        Arrays.sort(array1);
        Arrays.sort(array2);

        boolean r2=Arrays.equals(array1,array2);
        System.out.println(r2);

        System.out.println(".............");
        char[]ch1={'a','b','c'};
        char[]ch2={'b','a','c'};

        Arrays.sort(ch1);//a,b,c
        Arrays.sort(ch2);//a,b,c

        boolean anagram= Arrays.equals(ch1,ch2);
        System.out.println(anagram);

    }
}
