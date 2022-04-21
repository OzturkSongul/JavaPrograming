package day10_NestedIf;

public class AgeGroup {
    public static void main(String[] args) {
        int age= 44;
        String result="";

        if(age>=0 && age<21 || age>=21 && age<55 || age>=55)
            if(age<21) {
                result = "Teenage";
            }
        else if (age>=21 && age<55) {
                result = "Adult";
            }
        else {
            result="Senior";
            }

            else {
            result = "invalid";
        }
        System.out.println(result);
        }
    }

