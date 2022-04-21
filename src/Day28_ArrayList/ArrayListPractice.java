package Day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        //first we get all

        list.add(10);// here eventhough 10 is int number, add method convert it atuomatcilly to Integer
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);


        for (int i = 0; i <list.size(); i++) {// i need every single element
         list.set(i,list.get(i)*2);// i(each index) will be replaced .
                                    // get(i)= will return element given index(i)
                                    // i(each element) will be replaced with element(index i) multipied with2
        }


        System.out.println(list);

        System.out.println(".................");

        ArrayList<String> employees= new ArrayList<>();
        employees.add("ahmet");
        employees.add("mehmet");
        employees.add("ali");
        employees.add("Mustafa");
        employees.add("ayse");
        employees.add("fatma");
        employees.add("hatice");

        System.out.println(employees);// it will be decreased for each time.
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);

        employees.remove(employees.size()-1);// removing last index
        System.out.println(employees);

        boolean r1= employees.remove("fatma");// this accept object, means primitive data
// also when it is remove we can assign boolean which return boolean
        System.out.println(employees);
        System.out.println("r1 = " + r1);
    }
}
