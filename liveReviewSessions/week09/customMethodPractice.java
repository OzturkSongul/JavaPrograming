package week09;

public class customMethodPractice {
    public static void main(String[] args) {

        int personOneAge = 10;
        if (personOneAge >= 21) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }
        System.out.println("...............");

        eligibleOrNot(45);

    }


        public static void eligibleOrNot ( int age){
            if (age >= 21) {
                System.out.println("eligible");
            } else {
                System.out.println("not eligible");
            }
        }
    }

