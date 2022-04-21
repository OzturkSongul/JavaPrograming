package day30_CustomClass;

public class car {
    public String brand;// to create seperate copy for each car we created instance variable
    public String model;
    public String color;
    public int year;
    public double price;

    public void setInfo(String carBrand, String carModel, String carColor, int carAge, double carPrice){
                      // when we call this method, we will have 5 arguments
        brand= carBrand;
        model= carModel;
        color= carColor;
        year= carAge;
        price= carPrice;
    }


    public String toString() {// for printing in console
        return "car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }

    public void drive() {
        System.out.println("Driving" + brand + " " + model);
    }

        public void stop() {
            System.out.println(brand + " " + model + "has stopped");
        }
        public void start(){
            System.out.println(brand + " "+ model + "has started");
        }
    }

