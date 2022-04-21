package day08_ifStatment;

public class MedianNumber {

    public static void main(String[] args) {


        int num1= 15;
        int numb2= 25;
        int numb3=35;

        boolean num1ismedianNumber= (num1>numb2 && num1<numb3 )|| (num1>numb3 && num1<numb2);
        boolean numb2ismedianNumber=( numb2>num1 && numb2<numb3) || (numb2>numb3 && numb2<num1);
        boolean numb3ismedianNumber= (numb3>numb2 && numb3<num1) || (numb3>num1 && numb3<numb2);
         // if 1 is median, 2 max and 3 minum, or 2 minum, 3 max
        // if 2 median, 1 max and 3 minum , or 3 max, 1 minum
        // if 3 median, 1 max and 2 minum, or 1 numin and 2max
        if ( num1ismedianNumber) {
            System.out.println(num1 + " is median number");
        }
        if (numb2ismedianNumber) {
            System.out.println(numb2 + " is median number");
        }
        if(numb3ismedianNumber) {
            System.out.println(numb3 + " is median number");
        }
        }
    }
