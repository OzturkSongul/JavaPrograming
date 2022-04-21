package day16_ForLoopStringPractice;

public class Task4_FrequencyOfJava {
    public static void main(String[] args) {

        String sentence= "why every java code makes me think java is difficult";
         int count=0;
        for (int i = 0; i <= sentence.length()-13 ; i++) {
            String s= sentence.substring(i,i+13);
            if(s.equalsIgnoreCase("java")){
                count++;
            }
        }
        System.out.println(count);
            }

        }

