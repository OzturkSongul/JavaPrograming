package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str= "Cydeo12345School!@#%WoodenSpoon";
        String digits="";//12345
        String letters="";//cyedoschool
        String specialChars="";//!@#%
        //we need each charcater of String, then ascii table to see the chacrater is dogit or letter..

        for (int i = 0; i < str.length(); i++) {//i=index numbers of str(0~last index)

            char ch= str.charAt(i);//every single character that we have in string
              //we are verifying if character is digit, leterr...
            if (ch>'0'&& ch<='9'){//if the chacrater is between 0-9
                digits+=ch;}
            else if(ch>='A'&& ch<='Z') {//we can use also or condtions here
                letters += ch;
            }else if(ch>='a'&& ch<='z'){
                letters+=ch;
            }else{
                specialChars+=ch;
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
    }
}
