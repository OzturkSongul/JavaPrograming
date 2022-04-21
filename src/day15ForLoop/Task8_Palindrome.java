package day15ForLoop;

public class Task8_Palindrome {
    public static void main(String[] args) {

        String word= "level";
        String result= "";

        for (int i = word.length()-1; i >=0 ; i--) {
            result += word.charAt(i);
        }
        if(word.equalsIgnoreCase(result)){
            System.out.println(word +" is a palindrome word");

        }
    }
}
