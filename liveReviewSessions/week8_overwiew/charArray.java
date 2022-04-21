package week8_overwiew;

public class charArray {
    public static void main(String[] args) {

        char[]letters= {'j','a','v','a', ' ', 'i','s', ' ', 'f','u','n' };
        for (char letter: letters) {
            System.out.print(letter + " ");
        }
        System.out.println();
        String sentence=new String (letters);//we made a string from a char
        System.out.println("sentence = " + sentence);

        //there is opposite of the action
        char[]newarray=sentence.toCharArray();// we did char again from string
        for(char c: newarray){
            System.out.print(c+" ");
        }




        }
    }

