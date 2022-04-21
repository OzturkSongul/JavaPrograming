package day41_Exceptions;

import day39_Recap.CydeoTask.Employee;

public class MultiCatchBlock {
    public static void main(String[] args) {

        Employee employee= null;

        try{
        System.out.println(employee.getSalary());// null pointer exception
    }catch(IndexOutOfBoundsException e) {
            System.out.println("first catch block");
            e.printStackTrace();
        }
        catch(ArithmeticException e) {
            System.out.println("second catch block");
            e.printStackTrace();
        }catch(NullPointerException e) {
            System.out.println("third catch block");
            e.printStackTrace();
        }
        System.out.println("..................");

        try {
            System.out.println("java".charAt(-1));
        }catch(RuntimeException e) {
            e.printStackTrace();
        }



        }
        }

