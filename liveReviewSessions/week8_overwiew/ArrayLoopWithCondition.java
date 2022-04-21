package week8_overwiew;

public class ArrayLoopWithCondition {
    public static void main(String[] args) {
        //amazon website serach result for a product

        double[]prices={22.9,12.4,43.12,65.0,100.4,543.23,98.22};

        for (double eachPrice:prices){
            System.out.println("eachPrice = "+eachPrice);

            //print all numbers from prices array that are more than 100

            for(double price:prices){
                if(price>100){
                    System.out.println("price =" +price);
                }

            }
             //prices between 10 and70 inclusive
            for(double price: prices){
                if(price>=10 && price<=70){
                    System.out.println("price = " +price);
                }
            }



        }


        }






    }


