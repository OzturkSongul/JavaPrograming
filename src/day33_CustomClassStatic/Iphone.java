package day33_CustomClassStatic;

public class Iphone {

    public static String brand= "Apple";// only one name, name is common, we initilaize once

    public String model;// have different model, we should create after object created

    public double price;

    public static String OS= "iOS";// only one common one

    public String color;

    public String size;

    public static String modelIn= "china";

    public static boolean hasBattery=true;

    public static boolean isTouchScreen= true;


    //public static void PrintModelAndPrice(){
        //System.out.println(model+":" +price);// will give error becaouse this varibales are not static

        public void method1(){// instance method accepts both instance variable and static variable
            System.out.println(model+":"+price);
            System.out.println(OS);
        }


    public static void PrintOperatingSystem(){//
        System.out.println(OS);


    }




}
