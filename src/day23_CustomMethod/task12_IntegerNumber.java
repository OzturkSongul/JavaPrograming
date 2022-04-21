package day23_CustomMethod;

public class task12_IntegerNumber {
    public static void main(String[] args) {
        IntegerNumber(-2);
    }

    public static void IntegerNumber(int number){

        if(number<0) {
            System.out.println("number is negative");
        }
        if(number==0) {
            System.out.println("number is zero");
        }
        if(number>0){
            System.out.println("number is pozitive");

        }
    }
}
