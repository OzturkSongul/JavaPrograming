package day13_String;

import java.util.Scanner;

public class task_initials {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter your first name");
        String FirstName= input.nextLine();
        System.out.println("enter your last name");
        String LastName= input.nextLine();
        input.close();

        char firstInit= FirstName.charAt(0);
        char lastInit= LastName.charAt(0);

        //String result= "" +FirstName.charAt(0)+ "." + ""+LastName.charAt(0);
        String result= firstInit+"."+lastInit;
        System.out.println(result);
    }
}
