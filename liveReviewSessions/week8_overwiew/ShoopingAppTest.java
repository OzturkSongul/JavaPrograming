package week8_overwiew;

public class ShoopingAppTest {
    public static void main(String[] args) {
        String[] items = {"shoes", "jacket", "Gloves"};
        double[] prices = {99.99, 150.0, 250.0};
        int[] itemID = {12345, 123456, 1234567};

        System.out.println(".......... find the first index of 'Gloves' in the itme srrsy.......");

        for (int i = 0; i < items.length; i++) {// items
            if (items[i].equalsIgnoreCase("gloves")) {

                System.out.println("gloves found at index : " + i);
                break;//just go out the loop
            }
        }

        //set a boolean variable true if 'ipad exist in the items

        boolean IpadExist = false;//once it is true it is gonna be true

        for (String item : items){
            if(item.equalsIgnoreCase("Ipad")) {
                IpadExist = true;
                break;
            }
            }

        if(IpadExist) {
            System.out.println("we have ipad in the list");
        }
        else{
            System.out.println("ipad not found");

            System.out.println(".....look for jacket in item and if found print all the details of the item");

            for (int i = 0; i < items.length ; i++) {
                if (items[i].equalsIgnoreCase("jacket")) {
                    String itemDetail = items[i] + " $" + prices[i] + " with " + itemID[i];
                    System.out.println("itemDetail= " + itemDetail);
                    break;
                }
            }



             }

            }
        }





