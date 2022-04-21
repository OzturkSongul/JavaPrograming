package Day24_CustomMethodReturnMethod;

import java.util.Locale;

public class BreakfastTask {

    public static void main(String[] args) {
      initials("cydeo","school");
      domain("sngldlsz@gmail.com");
        System.out.println("............");

        String[]emails = {"joshgmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsem@gmail.com"};
         for(String email:emails){
             domain(email);
             nameOfMonth(3);
         }
    }
    //create a method that can display the initials of the person.
    //initials(String firstName,String lastName)
    public static void initials(String firstName, String lastName){
        //System.out.println("hello world");// this is method's function

        String initial=firstName.charAt(0)+"."+ lastName.charAt(0);
        initial= initial.toUpperCase();
        System.out.println("initials = "+initial);
    }

    //create a method that can display the domain the email.//domain(String email)
    public static void domain(String email){//cydeo@gmail.com
        String domain= email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("domain= " +domain);
    }

    //create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){
        String name="";
        if(number>=1 && number<=12) {
            name= (number==1)? "jan" :(number==2)?"feb" :(number==3)?"march":(number==4)?"april"
                    :"dec";

        }else {
            name = "invalid";
        }
        System.out.println("month name= "+name);
        }

        //create a method that can print the name of the day of month based on the given number to the method

    }

