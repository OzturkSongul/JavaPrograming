package day17_WhileDoWhileLoops;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "AAABBBC";
        char ch = 'A';//how many times appear we will find
        int frequency = 0;//frequence is always integer.//+1+1+1==3
        //to find how many char chacarter appear, first we need to find each chacrater of index
        for (int i = 0; i < str.length(); i++) {//i=index of str
            char eachChar = str.charAt(i);//each charater of str
            //we will look each charater and compare with char variable when it is match we will increase frequence


            //'A' is given ch,
            if (ch == eachChar) { //if given ch is matching with eachcharatter
                frequency++;
                //frequency+ =1; also we can write like this
            }
        }
            System.out.println(frequency);
//remember, only inside of loop we are wrting what we want to repeat
 //print statement should be outside of loop


    }
        }



