package Day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {
    public static void main(String[] args) {

        ArrayList<Pizza>pizzas=new ArrayList<>();

        for (int i = 1; i < 100; i++) {
            Pizza small = new Pizza('S', 2, 1);
            Pizza medium = new Pizza('M', 3, 4);
            Pizza large = new Pizza('L', 4, 5);

            pizzas.addAll(Arrays.asList(small, medium, large));
        }
        System.out.println("total number of pizza: "+pizzas.size());
        double totalPrize=0;

        for(Pizza pizza: pizzas) {
            totalPrize += pizza.calcCost();
        }

            System.out.println("totalPrize = " + totalPrize);



        }
    }

