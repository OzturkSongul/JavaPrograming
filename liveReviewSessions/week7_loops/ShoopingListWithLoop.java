package week7_loops;

import java.util.Scanner;

class ShoopingListWithLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ShoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do {
            System.out.println("enter item" + count + "and its price");
            item = input.nextLine();
            price = input.nextDouble();
            ShoppingListReport += "Item" + count + ":" + item + "price:" + price + ",";
            count++;
            totalPrice += price;
            System.out.println("Add one more item");
            input.nextLine(); //takes enter from previous double method
            countinue = input.nextLine();
        }

        while(countinue.equalsIgnoreCase("yes"));
        System.out.println(ShoppingListReport.substring(ShoppingListReport.length()-1));

        System.out.println("totalPrice = " + totalPrice);

    }
}
