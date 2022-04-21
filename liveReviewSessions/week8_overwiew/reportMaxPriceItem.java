package week8_overwiew;

public class reportMaxPriceItem {
    public static void main(String[] args) {
        String[] items = {"shoes", "jacket", "Gloves"};
        double[] prices = {99.99, 150.0, 250.0};
        int[] itemID = {12345, 123456, 1234567};


        double maxPrice= prices[0];//assume that first one is max price
        int indexOfMaxPrice= 0; // assume that max price is at the fist index
        for (int i = 0; i < items.length ; i++) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                indexOfMaxPrice = i; // ilkonce max price ve index numbera gecici bir deger verdik, sonra loop icersinde bu degerlerin dogru olup olmadiklarina baktik, eger
                //dogru degillerse max ve index number icin yeni deger verdik.

            }
        }
        System.out.println("indexOfMxPrice= "+ indexOfMaxPrice);
        System.out.println("maxPrice= " + maxPrice);

        //assumsion for minumn

        double minPrice= prices[0];
        int indexOfMinPrice= 0;

        for (int i = 0; i < items.length ; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                indexOfMinPrice = i;
            }
        }
        System.out.println("indexOfMinPrice= "+ indexOfMinPrice);
        System.out.println("minPrice= " + minPrice);
            }

        }



