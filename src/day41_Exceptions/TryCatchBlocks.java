package day41_Exceptions;

import javax.management.RuntimeErrorException;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("test started");

        try {
            System.out.println(9 / 0);// in here programme will be terminated

            System.out.println("Try Block");


        }catch (ArithmeticException e){

            System.out.println("catch block");

            System.out.println("Arithmetic Exception was occurred");
        }



        System.out.println("test1 complicated");

        System.out.println("............");

        System.out.println("test2 started");
        int[]numbers={1,2,3,4,5};

        try {

            System.out.println(numbers[200]);

            System.out.println("try block ");
        } catch (RuntimeException e){
            e.printStackTrace();

        }

        System.out.println("test2 complicated");

        System.out.println("..................");

        System.out.println("test3 started");


       try {
       System.out.println("Cydeo".substring(2, 0));// runtime exceptions parent of all unchecked exception
         }catch (RuntimeException e){
        e.printStackTrace();// all detail of exception
        }
        System.out.println(("test 3 started"));

        System.out.println("...............");

        System.out.println("hello");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("cydeo");


        }



    }

