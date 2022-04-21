package day23_CustomMethod;

public class task15_Calculator {
    public static void main(String[] args) {
        Calculator(12,3,'+');
    }

    public static void Calculator(int num1,int num2, char mathOperator){
        if(mathOperator=='+') {
            System.out.println(num1 + num2);
        }
        if (mathOperator == '-') {

            System.out.println(num1 - num2);
        }
        if(mathOperator=='*') {
            System.out.println(num1 * num2);
        }
        if(mathOperator=='%') {
            System.out.println(num1 / num2);
        }
        }

        }
