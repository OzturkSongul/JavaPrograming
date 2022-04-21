package day05_Concateration;

public class Calculator {

    public static void main(String[] args) {

        int firstNumber= 100;
        int secondNumber= 50;
        int addition= firstNumber+secondNumber;
        int subtraction= firstNumber-secondNumber;
        int multiple = firstNumber * secondNumber;



        // 100+50= 150
        // 100-50=50
        //100 *50= 5000
        System.out.println(firstNumber + " +" + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + "+" + secondNumber + "=" + addition);

        System.out.println(firstNumber + "_" + secondNumber + "=" + (firstNumber-secondNumber));
        System.out.println(firstNumber + "_" + secondNumber + "=" + subtraction);
        System.out.println(firstNumber + "*" + secondNumber + "=" + firstNumber*secondNumber);
        System.out.println(firstNumber + " *" + secondNumber + "=" + multiple);


      long a=30L;
      long b= (short)a;
        System.out.println("b = " + b);

       float a2= 100.987_6543f;
       short b2= (byte)a2;
       byte c2= (byte)b2;
        System.out.println("c2 = " + c2);

        int a3= 3, b3=2;
        long c3= (a+b) * 2/3%2;
        System.out.println("c3 = " + c3);

        long a4= 3_000L;
        double b4= (float)a4;
        int c4= (short)b4;
        System.out.println(c4%1000);

        System.out.println(10/3);
        System.out.println(10/3.0);
        System.out.println((int)(10.0/3));







    }





        







    
}
