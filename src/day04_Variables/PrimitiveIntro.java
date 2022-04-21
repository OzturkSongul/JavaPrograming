package day04_Variables;

import javax.lang.model.SourceVersion;

public class PrimitiveIntro {
    public static void main(String[] args) {

        // age:38 years old

        byte age = 38;

        //weight: 160 pounds
        //byte weight =160; 160 is out of byte range

        short weight = 160; // 160 is within the range of short

        //salary: 100000$
        //short salary= 100000 is out of the short range

        int salary = 100000; // int is the preferred data type for integer numbers.

        long asset = 3_333_333_333L;
        // tax: 0.26
        float tax= 0.26F;
        double PI= 3.14;


//#
       char ch1= '#';
        System.out.println("ch1 = " + ch1);
        char ch2= 35;
        System.out.println("ch2 = " + ch2);
        char ch3= 45000;
        System.out.println("ch3 = " + ch3);
        char ch4 = 3896;
        System.out.println("ch4 = " + ch4);

        char gender= 'F';
        char grade= 'A';
        //
        boolean isEmployed= true;
        boolean isMarried= false;

        boolean result= 100> 150;
        System.out.println("result = " + result);
        System.out.println("isMarried = " + isMarried);
        System.out.println("isEmployed = " + isEmployed);

//
        String name= "Wooden Spoon";
        String city= " London";
        String country= " England";

        System.out.println("name = " + name);
        System.out.println("country = " + country);
        System.out.println("city = " + city);
        





    }







}
