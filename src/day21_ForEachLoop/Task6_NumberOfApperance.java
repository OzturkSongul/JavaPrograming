package day21_ForEachLoop;

import java.util.Arrays;

public class Task6_NumberOfApperance {
    public static void main(String[] args) {

        String sentence = "I love java but I do not know phyton like java everybody says java and phyton is similar";

        String [] words= sentence.split(" ");
        int javaCount = 0;
        int phytonCount = 0;

        for (String each : words) {
            if (each.equals("java")) {
                javaCount++;
            }
            if (each.equals("phyton")) {
                phytonCount++;
            }
        }
        System.out.println(javaCount + " java and " + phytonCount + " Python ");
    }
}




