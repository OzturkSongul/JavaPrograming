package day42_ExceptionContinue;

public class MorningWorkOut {
    public static void main(String[] args) {

        System.out.println(".........push up started..........");

        for (int i = 1; i <= 30; i++) {// we want 30 push ups so used loop


            System.out.print("\rpush up" + i); // if we want to have in one line, delete ln and use \r
            try {
                Thread.sleep(150);// we need to wait between push ups

            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
        System.out.println("..............push ups completed");

        System.out.println(".............pull up started");

        for (int i = 1; i <= 20; i++) {


            System.out.print("\rPull up" + i);
            // if we need to use sleep method several times, then we can write our own custom method then use it
            // so we dont need to handle everytime for exceptions
            sleep(2.5);
            }

            System.out.println("pull up completed");
        }

        public static void sleep ( double seconds){// custom method for sleep


            try {
                Thread.sleep((long) (seconds * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }





