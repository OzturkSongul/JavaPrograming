package day19_LoopPractice;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "aaabbcccc";
        String result = "";//a3b2c4// the result should be


        for (int j = 0; j < str.length(); j++) {


            // until here we only look one character of frequency, now we need look remain character
            char ch = str.charAt(j);// 'a', we are gonna compare this charater with each charater of str
            int count = 0;

            //for comparing using for loop
            for (int i = 0; i < str.length(); i++) {// i is here index number of 'a'

                char each = str.charAt(i);// each charater of str

                // to find how many time 'a' is wrting we need compare ch and each variable

                if (ch == each) {
                    count++;// whenever ch is matching any of each character frequency will be increase
                }

            }
            if (result.contains("" + ch)) { //in here we are skipping repeated character
                continue;
            }
            result += ch;
            result += count;
        }
        System.out.println(result);
    }
}




