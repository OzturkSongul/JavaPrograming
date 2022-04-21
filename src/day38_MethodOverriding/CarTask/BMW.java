package day38_MethodOverriding.CarTask;

public class BMW extends Car{
    public BMW( String model, int year, double price, String color, double miles) {
        super("BMW", model, year, price, color, miles);
    }
    public void breakdown() {
        System.out.println(brand + model + " breaks down every 100 miles");

    }
    public void racing(){
        System.out.println(brand+ model+ " is a racing car");
    }
    public void start(){
        System.out.println("call mechanic to jump start");
    }
}
