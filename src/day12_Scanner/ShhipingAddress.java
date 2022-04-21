package day12_Scanner;


import java.util.Scanner;

public class ShhipingAddress {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter your name");
        String name= input.nextLine();

        System.out.println("enter your building number");
        String buildingNumber= input.next();

        input.nextLine();


        System.out.println("enter street name");
        String streetName= input.nextLine();

        System.out.println("enter your city name");
        String cityName= input.nextLine();

        System.out.println("enter your state name");
        String stateName= input.nextLine();

        System.out.println("enter your postcode");
        String postCode= input.next();
        input.nextLine();

        System.out.println("enter your country name");
        String country=input.nextLine();


        System.out.println("name = " + name);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName);
        System.out.println("stateName = " + stateName);
        System.out.println("postCode = " + postCode);
        System.out.println("country = " + country);
        input.close();

    }
}






//enter your name(nextline())
//building number(next())
//street name next()
//city name nextline()
//your state next()
//zip code next()