package day19_LoopPractice;

public class Task6_HighiestFrequency {
    public static void main(String[] args) {


        String stc = "aaaabbbbccdddffffffhhhhhkkklsssssssss";

       int highFrequency=0;



        for (int i = 0; i <stc.length(); i++) {
            char ch= stc.charAt(i);
            int count=0;
            for (int j = 0; j <stc.length() ; j++) {
                if (ch == stc.charAt(j)) {
                    count++;
                }
            }
            if(count>highFrequency) {
                highFrequency = count;

            }

            }
        System.out.println(highFrequency);

         String result="";

        for (int i = 0; i <stc.length() ; i++) {
            char ch=stc.charAt(i);
            int count=0;
            for (int j = 0; j <stc.length() ; j++) {

            }


        }


            }


        }

