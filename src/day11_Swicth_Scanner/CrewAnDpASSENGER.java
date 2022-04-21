package day11_Swicth_Scanner;

public class CrewAnDpASSENGER {
    public static void main(String[] args) {

        int number = 75;
        String result = "";
        boolean validNumber = (number == 50 || number == 100 || number == 75);
        if (validNumber) {
            if (number == 50) {
                result = "20 crew and 30 passenger";
            } else if (number == 75) {
                result = "25 crew and 50 passenger";
            } else {
                result = "30 crew and 70 passenger";
            }
        } else {
            result = "invalid number";
        }
            System.out.println(result);
        }
    }









