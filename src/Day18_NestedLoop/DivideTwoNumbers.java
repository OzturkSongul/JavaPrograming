package Day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int num1=30;
        int num2= 7;
        int count=0;//how many time num1 substring num2

        while(num1>=num2){
            num1-=num2;
            count++;}
        System.out.println(count+ "with remainder of "+num1);
            }

        }//this is an example of interview question


