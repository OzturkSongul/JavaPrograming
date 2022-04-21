package day23_CustomMethod;

public class task1_oddNumbers {
    public static void main(String[] args) {
        oddNumber();
        evenNumber();
        eligible(16);

    }

    public static void oddNumber() {
        for (int i = 1; i < 101; i++) {
            if (!(i % 2 == 0)) {
                System.out.print(i + "\t");
            }

        }

    }

    public static void evenNumber() {
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "\t");

            }
        }
    }


    public static void eligible(int age) {

        if (age >= 21) {
            System.out.println("You are eligible");
        } else {
            System.out.println("You are not eligible");

        }

    }
}




