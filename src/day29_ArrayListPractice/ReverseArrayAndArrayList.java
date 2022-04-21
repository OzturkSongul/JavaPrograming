package day29_ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {

        int[] array= {1,2,3,4,5,6};// want to reverse
        int[]result= new int[array.length]; // to get enough space for new array

        int j=0;// i is here index number of old array, so j will be index number of new array we created for reverse
        for (int i = array.length-1; i >=0 ; i--,j++) {
            result[j] = array[i];
        }

        System.out.println(Arrays.toString(result));// here we did from Array to ArrayList

        System.out.println(".......................");

        ArrayList<Integer>list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6));// we need reverse

        ArrayList<Integer>reversedList=new ArrayList<>();// we dont need to find index number this time
        //just we need to get last element and add it to new arraylist

        for (int i = list.size()-1; i >=0; i--) {// first so we can get lat index
            int each = list.get(i);// then we will have the element form index number with get method
            reversedList.add(each);
        }
        System.out.println(reversedList);

        }

        }

