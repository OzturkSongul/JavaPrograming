package day08_ifStatment;

public class GradeReport {
    public static void main(String[] args) {

        int score= 85;// 0-100

        boolean a= score>=90 && score<=100;
        //           false   true= true
        boolean b= score>=80 && score<=89;
        // boolean b= score> && !a;

        boolean c= score>=70 && score<=79;
        //boolean c= !a && !b && score>= 70

        boolean d= score>= 60 && score<=69;
        //boolean d= !a && !b && !c && score>=60

        boolean f= score>=50 &&score<= 59;
        //boolean f= !a && !b && !c && !d && score>= 50
         if (a) { //if the student made a
             System.out.println("excellent");
         }
         if (b) {
             System.out.println("great");
         }
         if (c) {
             System.out.println("good");
         }
         if (d) {
             System.out.println("passed");
         }
         if (f) {
             System.out.println("fail");
         }
















    }





}


