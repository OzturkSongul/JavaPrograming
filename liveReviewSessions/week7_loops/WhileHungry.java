package week7_loops;

public class WhileHungry {
    public static void main(String[] args) {

        boolean isHungary= true;//it is our precondition, when it is true it is going go inside

        int bananas= 0;//we start with 0
        int countFull= 3;
        //while statement is checking condition

        while(isHungary) {//true
            bananas++;
            System.out.println("eating a banana: \uD83C\udF4C " + bananas);
            //condition that will change the boolean to false
            //unicodes
            if (bananas == countFull) {
                isHungary = false;

            }
        }//when the condition is false we get out the loop
        System.out.println("has enough bananas");
            }
        }
/*
         while(true){
         bananas++;
         System.out.println("eating banana")
         //the condtition that will take us out of the loop
         if(bananas==countToFull){
         isHungary=false;
         break;//branching statement
         }
         }
         System out.println(" had enough bananas")
 */



