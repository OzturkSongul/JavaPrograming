package day42_ExceptionContinue;

public class DisavtangesOfThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("hello");
        sleep(2.5);// throws

        System.out.println("hello word");

        System.out.println("..........");

        System.out.println("hello");

        MorningWorkOut.sleep(2.5);// try and catch
        System.out.println("cydeo");
    }

    public static void sleep(double second) throws InterruptedException {
        Thread.sleep((long) (second*1000));









    }
}
