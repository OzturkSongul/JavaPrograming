package Day20_ArrayIntro;

public class Task3_indexNumber {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "ipad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 123456, 1234567, 12345678, 123456789, 12350};
        int IndexNumber = 0;
        boolean hasiPad = false;
        String report = "";

        for (int i = 0; i < items.length; i++) {
            String itemName = items[i];
            if (itemName.equals("Gloves")) {
                IndexNumber = i;
            }
        }

        for (int i = 0; i < items.length; i++) {
            String itemName = items[i];
            if (itemName.equals("iPad")) {
                hasiPad = true;
            }

            report += itemName + "-" + prices + "-" + itemIDs;
        }
            System.out.println(report);
            System.out.println(IndexNumber);
            System.out.println(hasiPad);

        }
    }






