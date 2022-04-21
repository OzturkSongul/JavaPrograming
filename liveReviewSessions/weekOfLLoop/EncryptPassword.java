package weekOfLLoop;

public class EncryptPassword {
    public static void main(String[] args) {
        /*
        given a string password.Encrypted with 'x' a given passord
        and print
        do with for loop
        password:cydeo
        encrypt= with char:x
        output: cxydxexox
         */

        String password = "cydeo";

        char encrypWithChar = 'x';

        String encryptedPassword = " ";// I need an empty baket for encrypeted passowrd

        for (int i = 0; i < password.length(); i++) {//i is here index of the password, 0 is here index of 'c' of cydeo
            encryptedPassword += ""+password.charAt(i) + encrypWithChar; //string+char+char=String
        }                        //concanite for string
            System.out.println("encryptedPassword = " + encryptedPassword);


        }
    }

