package day09_ifElseStatement;

public class Salary {
    public static void main(String[] args) {
        double salary= 120_000;
        boolean isMarried=true;

        if(salary>130.000 ){
            System.out.println(salary*35/100);}
        else if(salary>100.000 && salary<130.000){
            System.out.println("salaryAfterTax : " + salary*30/100);}
        else if (salary>80.000 && salary<100.000){
            System.out.println("salaryAfterTax : " + salary*25/100);}
        else{
            System.out.println("salaryAfterTax : " + salary*20/100);}







        }
    }
