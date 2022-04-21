package Day25_CustomMethod_Overloading;

public class SumOfNumbers {

    public static void main(String[] args) {
        int sum =SumOf2Numbers(10,20);
        System.out.println(sum);
        int sum2= sumOf3Numbers(12,23,34);
        System.out.println(sum2);
        int sum3=sumOf4Numbers(14,13,21,15);
        System.out.println(sum3);
    }

    public static int SumOf2Numbers(int num1, int num2) {
        return num1 + num2;
    }
    public static int sumOf3Numbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    public static int sumOf4Numbers(int num1, int num2, int num3, int num4){
        return num1+num2+num3+num4;
    }
}
