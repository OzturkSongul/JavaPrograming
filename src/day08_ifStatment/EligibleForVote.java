package day08_ifStatment;

public class EligibleForVote {

    public static void main(String[] args) {

        String name= "Hatice";
        int age= 38;
        String citizen= "USA";

        boolean eligible= age>= 21 && citizen=="USA";

        if (eligible){
            System.out.println("Eligible");
        }

        if (!eligible){
            System.out.println("notEligible");
        }



    }

}
