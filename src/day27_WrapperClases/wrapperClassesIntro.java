package day27_WrapperClases;

public class wrapperClassesIntro {

    public static void main(String[] args) {

        int num1= 200;// to store in other data structure I need to convert
        Integer n1=num1; // autoboxing

        int num2= n1;// unboxing// converting to object to primitive data
        System.out.println("..............");

        Integer integerValue=100;
        long longValue= integerValue;// converting integervalue to long
        System.out.println("..............");

        int num3=200;
        //long l2=num3;// it should be same datatype
        Integer num4=num3;//autoboxing

        System.out.println(".................");
        int[]numbers1={1,2,3,4,5};
        Integer[]numbers2= {1,2,3,4,5};
    }
}
