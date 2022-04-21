package day34_GarbageCollection_AccessModifiers;
import static day34_GarbageCollection_AccessModifiers.Circle.pi;

import static day34_GarbageCollection_AccessModifiers.Circle.*;


public class StaticImport {
    public static void main(String[] args) {

        System.out.println(Circle.pi);
        System.out.println(pi);// we can call now without calling classname

        System.out.println(Circle.name);
        System.out.println(Circle.numbers);
        System.out.println(name);// we are gonna call without class name, becaosue we import static memebers
        System.out.println(numbers);



    }
}
