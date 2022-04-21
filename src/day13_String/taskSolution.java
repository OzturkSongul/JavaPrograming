package day13_String;

import java.util.Scanner;

public class taskSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();

        scan.close();

        char firstChar = word.charAt(0),
                lastChar = word.charAt(word.length() - 1);

        if (firstChar == lastChar) {
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }

    }
}
