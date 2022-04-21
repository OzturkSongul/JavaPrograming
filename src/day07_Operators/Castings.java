package day07_Operators;

public class Castings {
    public static void main(String[] args) {
         float averageScore =20.5f;
         byte num1= (byte)averageScore;
        System.out.println("num1 = " + num1);//explicit casting

        short numb2= (short) averageScore;
        System.out.println("numb2 = " + numb2);// explicit casting, alt+enter for shortcut
/*
implicit cast: casting smaller part to larger part
explicit : casting larger part to smaller part
 */
        int num3= (int)averageScore;
        float number4= (float)averageScore;// no casting
        double number5= (double)averageScore; // implicit casting
        long number6 = (long)averageScore;// explicit casting

        System.out.println("num3 = " + num3);
        System.out.println("number4 = " + number4);
        System.out.println("number5 = " + number5);
        System.out.println("number6 = " + number6);


        //declare a variable of float named averageScore and initialize it to 20.5
        // declare the following variables and assign averageScore to each of them;
        /*
        byte num1
        short numb2
        int numb3


         */
    }



}
