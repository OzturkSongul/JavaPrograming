package day09_ifElseStatement;

public class FINRA {
    public static void main(String[] args) {
        int number1= 45;
        String result="";
        if (number1%3==0 && number1%5==0){
            result="FINRA";}
        else if(number1%3==0){
            result="fIN";}
        else if (number1%5==0){
            result= "RA";}
        else{
            result= ""+number1;}

        System.out.println("result =" +result);
        }
    }

