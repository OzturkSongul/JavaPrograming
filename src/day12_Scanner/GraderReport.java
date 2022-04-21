package day12_Scanner;

import java.util.Scanner;

public class GraderReport {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 0 to 100");
        int num = scan.nextInt();
        String result = "";
        if (num >= 0 && num <= 100) {
            result = (num >= 0 && num <= 59) ? "F" : (num >= 60) ? "D" : (num >= 70) ? "C" : (num >= 80) ? "B" : "A";
        }else{
            System.out.println("Invalid Number");
        }
        System.out.println(result);
        scan.close();
    }
}





