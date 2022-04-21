package day17_WhileDoWhileLoops;

public class frequencyOfWord2 {
    public static void main(String[] args) {
        String str = "Cat Cat Dog Dog";

        int frequency = 0; // our final result will integer
        for (int i = 0; i <= str.length()-3; i++) {//number 3 is here depend on lenght of word
            String eachSub = str.substring(i, i + 3);

            //System.out.println(eachSub);we look each substring
            if (eachSub.equals("Cat")) {
                frequency++;
            }
        }
        System.out.println(frequency);
    }
    }

