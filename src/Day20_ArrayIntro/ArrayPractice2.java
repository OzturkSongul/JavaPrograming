package Day20_ArrayIntro;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        char[]letters= new char[26];

        //for (char i = 0,j='A'; i <letters.length;  i++,j++) {//in here i represent index number, j represent character
          //letters[i]=(char)j;
         char ch='A';
        for (int i = 0; i < letters.length ; i++) {
            letters[i]=ch++;

        }

            //we create another variable in loop


        System.out.println(Arrays.toString(letters)); //A-Z

        //letters[0]='A';//we dont have to write all 26 character like this, we can sue loop
        //letters[1]='B';

        System.out.println(".....................");


            
        }




    }

