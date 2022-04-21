package day17_WhileDoWhileLoops;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
        String str= "Java Java Python Python";
        int frequency=0;

        while(str.contains("Java")){
            str=str.replaceFirst("Java", "");
            frequency++;
        }

            System.out.println(frequency);
        System.out.println("................");

        String sentence= "cat cat cat dog dog dog cat cat";

        int countCat=0;

        while(sentence.contains("cat")){
            sentence=sentence.replaceFirst("cat", "");
            countCat++;}
        System.out.println(countCat);

        }
        }//to find frequency we create condition and if condition is true, we asked to replace the word with empty(
// basically we are deleting the words for finding frequency.then it is gonna be by 1 by/




