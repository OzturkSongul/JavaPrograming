package day12_Scanner;

import java.util.Scanner;

public class day12_Task3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a cents value");
        int cents=input.nextInt();
        input.close();

        int Dollar= cents/100;
        cents=cents%Dollar;

        System.out.println(Dollar+" dollars and "+cents+" cents");

    }
}
