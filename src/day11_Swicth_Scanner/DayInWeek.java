package day11_Swicth_Scanner;

public class DayInWeek {

    public static void main(String[] args) {
        int number= 8;

        //if (number==1) {
            //System.out.println("Monday"); //is not fast

        switch(number){
            case 1:
                System.out.println("Monday");
                break;//exist the switch after executing the case block
            case 2:
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:// only executed if none of the case blocks are matching
                System.out.println("invalid");
                break;// if default is in the end, break is not mandatory.

        }
        }
    }

