package day23_CustomMethod;

public class CustomMethodwithParameters {
    public static void main(String[] args) {
        //oddOrEven();//the method demands additioanl info to complite the task

        oddOrEven(10);
        ageOfPerson(1995);
        printNumber(1000,2000);

    }

    //create a function that can check if a number is odd number of even number

    public static void oddOrEven(int number) {//if we want extra information have parameter
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }

    }

    //create a function that can display the age of the person
    public static void ageOfPerson(int birthyear) {
        int age = 2021-birthyear;
        System.out.println("your age is " + age);
    }

    //cretae
    public static void printNumber(int x, int y){

    }
}


