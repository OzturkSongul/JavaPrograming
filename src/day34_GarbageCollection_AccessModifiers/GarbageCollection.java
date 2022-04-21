package day34_GarbageCollection_AccessModifiers;

import Day32_CustomClassConstructor.Car;
import day30_CustomClass.Dog;
import day30_CustomClass.DogObject;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {

        //int n= null;// it is not object null is means is empty
        //String str= null;// null only for unprimitive data

        //System.out.println(str.toUpperCase());

        String str1= "wooden Spoon";
        str1=null;// after this line "wooden spoon" will be eligible for garbage collection
        // this is way to make one variable eligible for garbage collection
        System.out.println(str1);// it is not eligible for garbage collection


        Car car1= new Car("toyota");
        car1=null;// now car1 is unreferenced

        System.out.println(car1);

        System.out.println(".....................");

        Dog dog1= new Dog();
        dog1.name= "Lucy";// after line 33 this dog1 will be unreferenced
        new Dog();// it is eligible for garbage collection
        dog1=new Dog();
        dog1.name="Max";// here we made it referenced
        System.out.println(dog1);

        String language= "Pthyon";
        // if we want to make it Python is eligible for garbage collection, we create w new object with same name

        language="java";

        System.out.println(language);// after line 39 language will be java

        System.out.println("...................");

        ArrayList<Integer>list1= new ArrayList<>();
        list1.add(100);
        ArrayList<Integer>list2=list1;// we want to assign list2 to list1
        list2.addAll(Arrays.asList(200,300,400));// we want to add three element to list2

        System.out.println(list1);
        System.out.println(list2);// list1 and list2 are sharing same object, so they will be same


        System.out.println(list1==list2);
    }


}
