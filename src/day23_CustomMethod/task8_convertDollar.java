package day23_CustomMethod;

public class task8_convertDollar {
    public static void main(String[] args) {
        convertDollar(25);
    }

    public static void convertDollar(double dollarAmount){
        double euro= dollarAmount*1.13;
        System.out.println(dollarAmount+ " dollar equal to " + euro+ "euro");
    }
}
