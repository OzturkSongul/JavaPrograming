package day23_CustomMethod;

public class task4_EligibleForVote {
    public static void main(String[] args) {
        eligibleVote(23);
    }



public static void eligibleVote(int age){

    if (age>=18) {
        System.out.println("eligible for vote ");
    }
    else{
        System.out.println("not eligible for vote");
    }

}
}
