package week8_overwiew;

public class Confirmation {
    public static void main(String[] args) {

        String confirmation = "ID : 223988\n " +
                "Amount:790 US\n " +
                "Card Number : 764398643\n " +
                "Name : Oscar\n " +
                "date : 11/10/2021";

        System.out.println("confirmation = " + confirmation);
        //chain your codes together
        String amount = confirmation.split("\n")[1].split(" ")[1];
        System.out.println("amount = " + amount);
        //confirmation.split("\n")= array
        //confirmation.split("\n")[1]= the second element of the array, so it is string
        //so I can split again, and provide index of second element I get amount.


    }
}


