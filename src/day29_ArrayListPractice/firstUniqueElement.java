package day29_ArrayListPractice;

import java.util.ArrayList;

public class firstUniqueElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        System.out.println(list);
        for (Integer each : list) {

            int frequency = 0;
            for (Integer element : list) { // comparing every single element with 1
                if (element == each) {
                    frequency++;
                }

            }
            if(frequency==1){
                System.out.println(each);
                break;
            }
        }
    }
}


