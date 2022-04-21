package day17_WhileDoWhileLoops;

public class Task1_divideTwoNumber {
    public static void main(String[] args) {
        
        int num1=12, num2=3;
        int result=0;

        while(num1>=num2) {
            num1 -= num2;
            result++;
        }

            System.out.println(result);
            
        }
    }

