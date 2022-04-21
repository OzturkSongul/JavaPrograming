package Day22_MultiDimensionalArray;

import java.util.Arrays;

public class reverseSecondWord {
    public static void main(String[] args) {

        String sentence= "I love Java";
        // first we need each word with split method, then get second word
        String []words= sentence.split(" ");



        String reverse= "";// here second word version will be stored

        for(int i=words[1].length()-1;i>=0; i--) {// in here second word's (index number 1) last char(length-1)
            //it will start form last char. this loop is for only second word
            reverse += words[1].charAt(i);
            // then it is going to give string with charat
        }
        System.out.println(reverse);

        //we want to replace second word with reversed one, we use replace method

        //sentence= sentence.replaceFirst(words[1],reverse);

        words[1]=reverse;// here reassign second word as reversed version

        System.out.println(Arrays.toString(words));

        //String result="";
        //for(String word: words){
            //result+= word+" ";
           // System.out.print(result);



        for(String word: words){// when we have array then we get each element with for each then write the sentnce
            System.out.print(word+" ");
        }


        }
    }

