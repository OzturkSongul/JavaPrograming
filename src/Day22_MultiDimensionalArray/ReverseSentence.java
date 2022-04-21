package Day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSentence {
        public static void main(String[] args) {
                String sentence = "Today is a good day to learn Java";

                String[] words = sentence.split(" ");
                 //when we use split method, we will get each word between quatation mark
                System.out.println(Arrays.toString(words));

                String reverseSentence= "";//I want restore reverse sentence here
                for (int i = words.length - 1; i >= 0; i--) {// first we split the sentnce inti the words then we need to reverse the words through index number
                        reverseSentence += words[i]+" ";//words[i] each word, then it is gonna added by +, also for space betwwen words use space
                }


                        System.out.println(reverseSentence);
                }

                }







