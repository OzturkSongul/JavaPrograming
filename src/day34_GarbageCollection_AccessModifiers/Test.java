package day34_GarbageCollection_AccessModifiers;

import Utilities.MathUtility;

import static day34_GarbageCollection_AccessModifiers.Circle.*;

import static Utilities.MathUtility.sum;


public class Test {
    public static void main(String[] args) {

        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);
        // they will executed with static block., static block can executed outside of class.

        System.out.println("...................");

        // find the sum of 10,20
        int r1= sum(10,20);
        // find the sum of 100,200

        int r2=sum(100,200);

        System.out.println(r1);
        System.out.println(r2);





    }
}
