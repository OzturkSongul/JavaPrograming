package day15ForLoop;

import java.util.Locale;

public class FormatFullName {

    public static void main(String[] args) {
        String FirstName= "cyDEo",
                lastName= "SCHOOL";
//FirstName=FirstName.substring(0,1).toUpperCase()+FirstName.substring(1).toLowerCase();
                      //C           +ydeo  ==    Cydeo

        FirstName= (""+FirstName.charAt(0)).toUpperCase() +FirstName.substring(1).toLowerCase();//chartAt is not string
        //so before using uppercase method it should be string data in the parantes.
        lastName= lastName.substring(0,1).toUpperCase()+ lastName.substring(1).toLowerCase();
        System.out.println(FirstName);
        System.out.println(lastName);
        String fullName= FirstName+ " " +lastName;
        System.out.println(fullName);


    }
}
