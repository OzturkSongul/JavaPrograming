package week7_loops;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {

        String source= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";

        System.out.println(source.length());

        String password= "";

        Random random= new Random();// I create a random object so I can generate random number

        for (int i = 1; i <=8 ; i++) { //it is going to generate 8 chacarter password

            int index=random.nextInt(71); // we want i randomly choosen//71 is here upper bound, means between 0-70
            System.out.println("index = " + index);
            password+= source.charAt(index);


        }
            System.out.println("password = " + password);

        }

    }

