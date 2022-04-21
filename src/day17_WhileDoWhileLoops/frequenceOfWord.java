package day17_WhileDoWhileLoops;

public class frequenceOfWord {
    public static void main(String[] args) {

        String str = "JavaJavaJavaJavaJava";

        int frequency = 0; // our final result will integer
        for (int i = 0; i < str.length()-3; i++) {//number 3 is here depend on lenght of word
            String eachSub = str.substring(i, i + 4);

            //System.out.println(eachSub);we look each substring
            if (eachSub.equals("Java")) {
                frequency++;
            }
        }
            System.out.println(frequency);
            }
        }//we create first all possible substring then compare the with given word.


