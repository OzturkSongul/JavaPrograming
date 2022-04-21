package day09_ifElseStatement;

public class CampusTime {
    public static void main(String[] args) {

        double time= 23.30;

        if(time>=8 && time<23.00) {
            System.out.println("open");
        }
        else{
            System.out.println("close");
        }
    }
}
