package weekOfLLoop;

public class example3 {
    public static void main(String[] args) {
        // write a program that display the nmber of even number between 5 and 50(included)
        // I am asking how many

        int countOfEven = 0;//it can start with O
        for (int i = 5; i <= 50; i++) {
            if (i % 2 == 0) {// this is our even numbers
                ++countOfEven;
            }
        }

        System.out.println("Count Of Even Numbers between 5 and 50=" +countOfEven);
    }
}




