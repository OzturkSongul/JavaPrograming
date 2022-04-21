package Day28_ArrayList;

import java.util.ArrayList;

public class removeDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);


        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) { // first we look each element of arraylist
            if (result.contains(each)) { // check if its contains, if contain then will be skipped
                continue;
            }
            result.add(each);// if it is not contained then will be added result arraylist
        }
        System.out.println(result);

        }
    }


