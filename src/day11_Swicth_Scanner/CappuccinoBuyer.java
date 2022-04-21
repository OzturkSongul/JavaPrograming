package day11_Swicth_Scanner;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "venti";
        if (size == "tall" || size == "grande" || size == "venti" || size == "invalid size")
            switch (size) {
                case "tall":
                    System.out.println("Price is $ 3.69 + 90 calories");
                    break;
                case "grande":
                    System.out.println("Price is $ 3.99 +120 calories");
                    break;

                default:
                    System.out.println("Price is $4.29 + 150 calories");
            } else {
            System.out.println("Invalid size");
        }

        }

        }






