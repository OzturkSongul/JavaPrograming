package day11_Swicth_Scanner;

public class Elevator {
    public static void main(String[] args) {
        int floorNum= 2;
        String result="";

        if (floorNum>=1 && floorNum<=3)
        switch (floorNum) {
            case 1:
                System.out.println("Floor 1 selected \nCompanies: Lobby,Verizon, Starbucks");
                  break;
            case 2:
                System.out.println("Floor 2 selected \nCompanies:Cybertek, NASA, Intelsat");
               break;
            default:
                System.out.println("Floor 3 selected \nCompanies: Lyft, BofA, Stake house");}
        else{
            System.out.println("Invalid number");


        }



    }
}
