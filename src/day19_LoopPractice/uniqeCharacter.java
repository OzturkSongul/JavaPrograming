package day19_LoopPractice;

public class uniqeCharacter {

    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";//in the end result will be there

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);//to make repeat for each character

            int count = 0;//represents the frequency of the ch (first character)

            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i);
                if (ch == each) {
                    count++;

                }

            }
            if (count==1) {//if frequecny of the character is 1, then it is unique
                result += ch;
            }
            }
            System.out.println(result);
        }
    }





