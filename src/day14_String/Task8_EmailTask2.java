package day14_String;

public class Task8_EmailTask2 {
    public static void main(String[] args) {
        String email= "songul_Ozturk@gmail.com";

        String firstName= email.substring(0,email.indexOf("_"));
        String lastName= email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domain= email.substring(email.indexOf("@")+1, email.indexOf("."));

        System.out.println("");
    }
}
