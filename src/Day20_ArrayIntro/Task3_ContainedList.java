package Day20_ArrayIntro;

public class Task3_ContainedList {
    public static void main(String[] args) {

        String[]items= {"Shoes", "Jacket", "Gloves", "AirPods", "ipad", "iPhone 12 case"};

        boolean hasiPad= false;

        for (int i = 0; i <items.length; i++) {
            String itemName= items[i];
            if(itemName.equals("iPad")){
                hasiPad=true;

            }

        }
        System.out.println(hasiPad);
    }
}
