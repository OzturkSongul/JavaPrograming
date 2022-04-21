package day23_CustomMethod;

public class task10_covertLira {
    public static void main(String[] args) {
        convert(25.6);
    }

    public static void convert(double liraamount){
        double dollar= liraamount*17.8;
        System.out.println(liraamount+ " equals to " + "dollar " +dollar);
    }
}
