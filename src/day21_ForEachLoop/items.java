package day21_ForEachLoop;

public class items {
    public static void main(String[] args) {

        String[]items= {"Shoes","Jacket","Gloves","AirPods","ipad","iPhone 12 case"};

        Double[]prices= {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};

         int[]itemIds= {12345, 12346,12347,12348,12349,12350};

        for (int i = 0; i < items.length; i++) {

            String item=items[i];
            double price=prices[i];
            int ids= itemIds[i];

            System.out.println(item+" -" +ids+" - $" +price);

        }


    }
}
