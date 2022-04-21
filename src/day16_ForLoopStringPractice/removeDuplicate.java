package day16_ForLoopStringPractice;

public class removeDuplicate {
    public static void main(String[] args) {
        String str= "aabbaacc";
        //final result=abc
        String result="";//abc
         //first we are gonna create loop, then have each character then add ecah character to result.

        for (int i = 0; i <=str.length()-1 ; i++) {//i:represent index numbers of str (start from 0)

            //char ch= str.charAt(i);// represent each character of str

            String ch=""+str.charAt(i); // we converted char variable to String variable, because contains method ask string variable.

            if(!result.contains(ch))// if the character is not contained in the result

             result+=ch;//the character will be added to the result
        }
        System.out.println(result);




    }
}
