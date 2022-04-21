package Day24_CustomMethodReturnMethod;

public class returnStatement {
    //create a method that can print the name of the day based on the given number of the method

    public static void main(String[] args) {
        nameOfDay(10);

    }
    public static void nameOfDay(int number){

        if (number<1 || number>5) {// when the value is not valid then we exist with return
            System.out.println("invalid");
            return;// if you are using return in void method, return is used for existing method

        }

        if(number==1) {
            System.out.println("Monday");
        }
        else if(number==2) {
            System.out.println("Tuesday");
        }
        else if(number==3) {
            System.out.println("Wednesday");
        }
        else if(number==4) {
            System.out.println("Thursday");
        }
        else{
            System.out.println("Friday");
        }


    }
}
