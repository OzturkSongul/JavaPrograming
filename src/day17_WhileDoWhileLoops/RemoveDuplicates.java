package day17_WhileDoWhileLoops;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str="AABBCC";
        String result="";//ABC

        for (int i = 0; i <str.length() ; i++) {
            String ch= ""+ str.charAt(i);// contain method is not used for char.so we will make it String
            if(result.contains(ch)) {
                continue;}
                result += ch;
            }
            System.out.println(result);
        }

    }

