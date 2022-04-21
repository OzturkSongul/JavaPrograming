package Day24_CustomMethodReturnMethod;

public class task1_FrequencyOfWord {
    public static void main(String[] args) {
        frequencyWord("java java java python python", "java");

    }

    public static int frequencyWord(String sentence, String word) {
        int count = 0;
        if (sentence.contains(word)) {
            sentence = sentence.replaceFirst("word ", " ");
            count++;
        }

        return count;
    }
}
