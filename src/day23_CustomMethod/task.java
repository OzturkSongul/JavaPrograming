package day23_CustomMethod;

public class task {
    public static void main(String[] args) {


        eligible(23);
    }



    public static void eligible(int age) {

        if (age >= 21) {
            System.out.println("You are eligible");
        } else {
            System.out.println("You are not eligible");
        }
    }
}
