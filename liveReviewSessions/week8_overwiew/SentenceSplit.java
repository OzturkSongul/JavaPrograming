package week8_overwiew;

import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {

        String searchResult= "1-16 of 829 results for ipad";
        // in my case cases I want to verify that my search result comes over 500

        //split method turns your string into array

        String []each= searchResult.split(" ");
        System.out.println(Arrays.toString(each));

        String searchAmount=each[2];
        System.out.println("searchAmount ="+ searchAmount);



    }
}
