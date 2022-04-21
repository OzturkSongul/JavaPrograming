package day29_ArrayListPractice;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class uniqeElement {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,3,3,4,5,5,6));

        ArrayList<Integer>unique=new ArrayList<>();
        for(Integer each:list) {// we are looking each element in arraylist
            int frequency = Collections.frequency(list, each);// then looking frequency of each element
            if (frequency == 1) {
                unique.add(each);// we are adding unique element to new arraylist
            }
        }
        System.out.println(unique);

        System.out.println("........................");
// second way for finding unique elements in arraylist
        ArrayList<Integer>list2= new ArrayList<>();
        list2.addAll(Arrays.asList(1,1,1,2,3,3,4,5,5,6));

        ArrayList<Integer>unique2= new ArrayList<>(list2);// we are moving all elements to uniqe2 Arraylist
                                                          // then we rae gonna remove ununiqe elements
       unique2.removeIf(p-> Collections.frequency(list2,p)>1);// if frequency bigger than 1 means it is not uniqe, then we are moving it

        System.out.println("unique2 = " + unique2);

        System.out.println(".........................");



            }
        }





