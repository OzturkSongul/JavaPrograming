package Day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysMethods2 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);

        System.out.println(list);

        //int num=1;
        //list.remove(num);// instead of given index number we can do that

        System.out.println(list);

        Integer num=200;// removing by object
        boolean r= list.remove(num);// num is object now// when removing is done successfully bollean retrun false

        System.out.println(list);
        System.out.println("r = " + r);

        System.out.println("..................");

        System.out.println(list.size());

        list.clear();

        System.out.println(list.size());
        System.out.println("............");

        ArrayList<Character> characters=new ArrayList<>();

        characters.add('a');
        characters.add('a');
        characters.add('c');
        characters.add('a');
        characters.add('a');

        int a= characters.indexOf('a');// will return int
        int b= characters.lastIndexOf('a');

        System.out.println(a);
        System.out.println(b);

        System.out.println("........................");

        boolean r2= characters.contains('a');
        boolean r3= characters.contains('z');

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println(".....................");

        ArrayList<Integer>list1=new ArrayList<>();

        list1.add(100);
        list1.add(100);
        list1.add(100);


        ArrayList<Integer>list2= new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1==list2);// they are nor different arraylist becaouse assign a new arraylist
        System.out.println(list1.equals(list2));// when both arraylists have same element and same oder

        System.out.println(".................");

        boolean r4 =list1.isEmpty();//will be false
        System.out.println("r4 = " + r4);
        System.out.println("........................");

        ArrayList<Integer>numbers= new ArrayList<>();
        //bulk operation:CollectionType
        //numbers.add(1,2,3,4)//
        numbers.addAll(Arrays.asList(1,2,3,4));
        System.out.println(numbers);

        //aslist= convert array value to collection type


        






    }
}
