package day09_ifElseStatement;

public class AgeGroups {
    public static void main(String[] args) {

      int age=56;
       if(age>=1 && age<=2) {
           System.out.println("infant");
       }
       else if(age>=3 && age<=5) {
           System.out.println("toddler");
       }
       else if(age>=6 && age<=9) {
           System.out.println("Kid");
       }
       else if(age>=10 && age<=12) {
           System.out.println("pre-teen");
       }
       else if (age>=13 && age<=17){
           System.out.println("teenager");}
       else if (age>=18 &&age<=20) {
           System.out.println("Young Adult");
       }
       else if (age>=21 && age<=39) {
           System.out.println("Adult");
       }
       else if (age>=40 &&age<=49) {
           System.out.println("young middle age Adult");
       }
       else if (age>=50 && age<=59) {
           System.out.println("middle aged adult");
       }
       else if (age>=55 && age<= 64) {
           System.out.println("very young senior citizen");
       }
       else if (age>=65 && age<=74) {
           System.out.println("young senior citizen");
       }
       else if (age>=75 && age<=84) {
           System.out.println("senior citizen");
       }
       else{
           System.out.println("old senior citizen");
       }








    }
}
