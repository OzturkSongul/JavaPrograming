package day16_ForLoopStringPractice;

public class Task5_CatDog {
    public static void main(String[] args) {

        String sentence=" cat dog gdog cAt";

        int catCount= 0;
        int dogCount=0;

        for (int i = 0; i <=sentence.length()-3; i++) {
            String s = sentence.substring(i, i + 3);
            if (s.equalsIgnoreCase("dog")) {
                dogCount++;
            }
            if (s.equalsIgnoreCase("cat")) {
                catCount++;
            }
        }
        if(dogCount==catCount) {
            System.out.println("they are evem");
        }
        else{
            System.out.println("they are not even");
            }

        }
    }

