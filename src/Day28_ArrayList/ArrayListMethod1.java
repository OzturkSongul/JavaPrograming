package Day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethod1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();// the object is created
        // now arraylist is emty, if we want to increase to size we should use add method
        numbers.add(10);//0// it is implicityly convert to Integer
        numbers.add(20);//1
        numbers.add(30);//2
        numbers.add(50);//3// it is added after last index

        numbers.add(2,25);// when we want to add 25 after spesific number
        numbers.add(5,45);
        System.out.println(numbers);
        System.out.println(numbers.size());// size of Arraylist

        int lastIndex= numbers.size()-1; // to find lastIndex of Array list
        System.out.println("lastIndex = " + lastIndex);

        int num=numbers.get(3);// it returns Integer, we converted to wrapper class to int

        System.out.println("num = " + num);

        System.out.println("..................");

        for (int i = 0; i < numbers.size(); i++) {// if I want to use all element of Arraylist

            System.out.println(numbers.get(i));// it is going to do multiple time to get all element

        }

        System.out.println(".........");
        ArrayList<String> list= new ArrayList<>();
        list.add("java");
        list.add("Pyhton");
        list.add("java");
        list.add("C#");
        list.add("Ruby");


        list.set(2,"javaScript");// Replace the element, size is not effected
        list.set(3,"C++");

        System.out.println(list);


    }
}
