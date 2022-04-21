package day11_Swicth_Scanner;

public class Calculator {

    public static void main(String[] args) {
        char operator= '$';
        double n1=200.5;
        double n2=10.5;

        boolean valid= operator=='+'|| operator=='-'|| operator=='*'|| operator=='/';
        if (valid) {
            switch(operator){
                case '+':
                    System.out.println(n1+n2);
                    break;
                case '-':
                    System.out.println(n1-n2);
                    break;
                case '*':
                    System.out.println(n1*n2);
                    break;
                default:
                    System.out.println(n1/n2);
            }

        }else{
            System.err.println("invalid operator: "+operator);
        }
    }
}
