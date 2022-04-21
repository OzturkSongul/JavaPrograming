package Day20_ArrayIntro;

public class UniqeElement {
    public static void main(String[] args) {

        String[] words = {"java", "java", "c#", "Python", "Python"};

        for (int j = 0; j < words.length; j++) {// in this loop line 10 until line 14 will be repetead

            String element = words[j];//when j is 0 we looked fisrt character//line 10 and 14, we are looking every character and we will repeat it
            int frequency = 0;
            for (int i = 0; i < words.length; i++) {//find the frequency
                if (words[i].equals(element)) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                System.out.println(element);


            }

        }
    }
}






