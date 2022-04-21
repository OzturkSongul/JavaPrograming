package day23_CustomMethod;

public class task16_FullName {
    public static void main(String[] args) {
        FullName("songul", "dilsiz");
    }

    public static void FullName(String firstName, String lastName){
        firstName= firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1);

        String fullName= firstName+ " " +lastName;
        System.out.println(fullName);
    }
}
