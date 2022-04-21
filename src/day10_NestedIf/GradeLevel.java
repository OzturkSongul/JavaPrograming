package day10_NestedIf;

public class GradeLevel {
    public static void main(String[] args) {
        byte number = 10;
        String result = "";


        if (number >= 1 && number <= 18) {

            if (number >= 1 && number <= 5) {
                result = "Elementary School";
            } else if (number >= 6 && number <= 8) {
                result = "Middle School";
            } else if (number >= 9 && number <= 12) {
                result = "High School";
            } else if (number >= 13 && number <= 16) {
                result = "College";
            } else {
                result = "Grad School";
            }
        } else {
            result = "Invalid School";
        }
        System.out.println(result);
    }

}








