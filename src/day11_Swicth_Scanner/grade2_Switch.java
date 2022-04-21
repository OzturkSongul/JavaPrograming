package day11_Swicth_Scanner;

public class grade2_Switch {

    public static void main(String[] args) {
        char ch= 'F';
        String result="";

        switch(ch){
            case 'A': case'B': case 'C': case 'D':
                //System.out.println("Passed");
                result="passed";
                break;
            default:
                //System.out.println("Failed");
                result= "fail";
        }
    }
}
