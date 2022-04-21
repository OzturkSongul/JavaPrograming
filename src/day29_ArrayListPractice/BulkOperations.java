package day29_ArrayListPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //list.addAll(1,2,3,4)// when we give multiple element it takes as array not collection
        //there is a special method to convert array to collection type
        list.addAll(Arrays.asList(1, 2, 3, 4, 3, 4, 4, 4));
        System.out.println(list);

        list.removeAll(Arrays.asList(3, 4));// will be removed all given element
        System.out.println(list);

        System.out.println("...........");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100, 200, 300, 400, 500, 100, 200, 300));
        numbers.retainAll(Arrays.asList(100, 200, 300));// will be removed not 100,200,300
        System.out.println(numbers);

        System.out.println(".................");
        ArrayList<String> JobTitle = new ArrayList<>();
        JobTitle.addAll(Arrays.asList("Qa", "Sdet", "Developer", "Scrum Master"));

        JobTitle.retainAll(Arrays.asList("Qa", "Sdet"));
        System.out.println(JobTitle);

        System.out.println("...........");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10));

        boolean r1 = nums.contains(10);

        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);

        boolean r3 = nums.containsAll(Arrays.asList(2, 5, 10));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("................");

        String[] names = {"ali", "ayse", "ahmet", "fatma"};
        //ArrayList<String>namesList= new ArrayList<>();
        //namesList.addAll(Arrays.asList(names));

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));//second way to convert Array to Arraylist

        System.out.println(namesList);

        System.out.println(".................");

        //int[]arr= {1,2,3,4,5,6,7,8};// primitive array. want to convert it arraylist
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8};// we need to convert int value
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr)); // aslist method shuold be used only when data is unprimitve

        System.out.println("list2 = " + list2);

        System.out.println(".................");

        int[]arr2= {1,2,3,4,5,6};
        ArrayList<Integer>list3=new ArrayList<>(convertArrayList(arr2));// convert int to
        System.out.println(list3);
    }

    public static ArrayList<Integer> convertArrayList(int[] array){// we are creating our own method for int
        ArrayList<Integer>list =new ArrayList<>();

        for(int each: array) {
            list.add(each);
        }
        return list;












    }
}
