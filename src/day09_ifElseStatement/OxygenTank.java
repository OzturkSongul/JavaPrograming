package day09_ifElseStatement;

public class OxygenTank {
    public static void main(String[] args) {
        int level = 75;
        String result = "";
        if (level >= 90) {
            result = "your tank is full";
        } else if (level >= 80) {
            result = "Still okey";
        } else if (level >= 70) {
            result = "Dont go too far";
        } else if (level >= 60) {
            result = "Start to head back";
        } else {
            result = "be careful now you at 50%";
        }

        System.out.println(result);
    }


            }



