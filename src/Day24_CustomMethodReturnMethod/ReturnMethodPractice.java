package Day24_CustomMethodReturnMethod;

public class ReturnMethodPractice {
    public static void main(String[] args) {

        //find the max number between 100 and 200
         int maxNumber=max(100,200);
        System.out.println(maxNumber);

        //multipy the max number by 2
       int multiply =maxNumber*2;
        System.out.println(multiply);
    }
    public static int max(int a, int b){
        int result=0;//the variable I want to store
        if(a>b) {
            result = a;
        }
        else {
            result = b;
        }
        return result;
        }
    }

