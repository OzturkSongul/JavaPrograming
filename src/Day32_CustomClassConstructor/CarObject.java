package Day32_CustomClassConstructor;

public class CarObject {
    public static void main(String[] args) {

        Car car1= new Car("Nissan");

        Car car2= new Car("Honda", "Accord") ;

        Car car3= new Car("toyota", "sun", 2020);

        Car car4= new Car("BMW", "x6", 2022, 50000);

        Car car5= new Car("Tesle", "MOdel3", 2019, 70000, "black");

        System.out.println(car2);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);




    }
}
