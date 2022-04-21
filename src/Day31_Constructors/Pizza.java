package Day31_Constructors;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping;


    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }



    public double calcCost(){
        double startingPrize= (size=='S')? 10: (size== 'M')?12 :14;
        double totalPrize= startingPrize+(numberOfCheeseTopping+numberOfPepperoniTopping);
        return totalPrize;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price=$"+calcCost()+
                '}';
    }
}
