package day38_MethodOverriding.CarTask;

public class toyota extends Car{


    public toyota( String model, int year, double price, String color, double miles) {
        super("Toyota", model, year, price, color, miles);
    }
    public void reliable() {
        System.out.println(brand + " is reliable");
    }

    public void start(){
        System.out.println("twist the key");
    }


    }

