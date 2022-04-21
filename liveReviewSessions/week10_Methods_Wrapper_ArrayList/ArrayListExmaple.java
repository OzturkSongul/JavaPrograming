package week10_Methods_Wrapper_ArrayList;

import java.util.ArrayList;

public class ArrayListExmaple {
    public static void main(String[] args) {

        //to show autoboxing

        ArrayList<Integer>arr= new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            //how can I out primitives into Arraylist: with the help of autoboxing
            arr.add(i);



        }
    }
}
