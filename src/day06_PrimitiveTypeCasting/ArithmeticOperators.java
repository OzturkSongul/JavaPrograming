package day06_PrimitiveTypeCasting;

public class ArithmeticOperators {
    /*
    + : addition
    -: subtract
    * : Multiplication
    /: Division
    in math
    10/4= 2.5
    in java
    10/4= 2 ( because 10 and 4 are integer number)
    10/0.4= 2.5 ( one of the number is decimal)
    % : remainder
     */
    public static void main(String[] args) {
        System.out.println( "12" + 1);/// 121
        System.out.println( 100-50);///50
        System.out.println(10 * 6);///60

        System.out.println(100/3);
        System.out.println(10/4);
        System.out.println(10.0/4);
        System.out.println( 10/ 4.0);
        System.out.println(10d/4);

        int a= 100;
        double b= a/6; //16
        System.out.println(b);

        double c= (double)a/6;

        System.out.println(c);

        System.out.println(100d);




    }




}
