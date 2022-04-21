package day08_ifStatment;

public class EvenlyDivisiable {

    public static void main(String[] args) {

        int number= 65;
        boolean divisibleBy2= 65%2==0;
        boolean divisibleBy3= 65%3==0;
        boolean divisibleBy5= 65%5==0;

        System.out.println(number + " divisible By two :" +divisibleBy2 );
        System.out.println( number + " divisible by three:" +divisibleBy3);
        System.out.println(number + " divisible by 5:" + divisibleBy5);

        System.out.println(";;;;;;;;;;;;;;;;;;;;;;");

        int number1= 2000;
        boolean isLeapYear= number1 %4==0;
        System.out.println(number1 + " is Leap Year:" + isLeapYear);



    }






}


