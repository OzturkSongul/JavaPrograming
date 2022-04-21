package day37_Inheritance_SuperKeyword.PhoneTask;

public class Phone {

    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;

    public static boolean hasBattery=true;// static means one copy, so that is why we dont inititize static in constructor
// we need that use static block
    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;

    }

    public void call(long phoneNumber) {
        System.out.println(brand +" "+ model+ " is calling");
    }
    public void text(long phoneNumber) {
        System.out.println(brand + " is texting");
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                ", color='" + color + '\'' +
                ", hasBattery='" + hasBattery + '\'' +
                '}';
    }
}



