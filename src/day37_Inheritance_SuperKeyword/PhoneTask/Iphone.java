package day37_Inheritance_SuperKeyword.PhoneTask;

public class Iphone extends Phone{

    public Iphone( String model, String size, double price, String color) {
        super("Apple", model, size, price, color);// every brand will be apple in iphone calss
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand+ " "+ model+ " is having facetime with "+ phoneNumber);

    }
}
