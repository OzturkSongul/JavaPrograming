package day09_ifElseStatement;

public class leapYear {

    public static void main(String[] args) {
        int year = 2000;
        boolean leapYear = year % 4 == 0;

        if (leapYear) {
            System.out.println(year + " is a leap year ");
        } else {
            System.out.println(year + "is not leap year");
        }
    }}






