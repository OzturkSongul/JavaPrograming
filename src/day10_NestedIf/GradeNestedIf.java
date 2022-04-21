package day10_NestedIf;

public class GradeNestedIf {
    public static void main(String[] args) {
        /*
        90-100=excllent
        80=89=Great
        70-79= good
        60-69= passed
        0-59=fail
         */
        int grade= 125;
        if (grade>=0 && grade<=100) {
            if (grade >= 90 && grade <= 100) {
                System.out.println("excellent");
            } else if (grade >= 80) {
                System.out.println("great");
            } else if (grade >= 70) {
                System.out.println("good");
            } else if (grade >= 60) {
                System.out.println("passed");
            } else {
                System.out.println("fail");
            }
        }else{
            System.out.println("invalid Number");

            }
        }


    }

