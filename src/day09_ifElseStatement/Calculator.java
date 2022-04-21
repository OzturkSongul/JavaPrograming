package day09_ifElseStatement;

public class Calculator {
    public static void main(String[] args) {
        int n1=12;
        int n2=4;
        char MathOperator='*';
          boolean add=MathOperator=='+';
           boolean minus=MathOperator=='-';
           boolean multiplaction=MathOperator=='*';
           boolean divide=MathOperator=='/';
        if(add) {
            System.out.println("the result is :"+ (n1+n2));
        }
        else if(minus) {
            System.out.println("the result is :" +(n1-n2));
        }
        else if (multiplaction) {
            System.out.println("the result is :"+(n1*n2));
        }
        else {
            System.out.println("the result is :"+ (n1/n2));
        }


        }
    }

