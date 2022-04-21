package day21_ForEachLoop;

import java.util.Arrays;

public class emergedArray {

    public static void main(String[] args) {

        String[] group1={"Ali", "Layas", "Aysenur"};//3 element
        String[] group2={"Maria", "Aygun","Duygu","Suat"};//4 element
        //we want to combine 2 arrays

        String[]students= new String[group1.length+ group2.length];//7 element
               int i=0;
             for (String each: group1) {//ali,layas,aysenur
                students[i++]= each;//every element will be added
             }
             for (String each : group2) {
                 students[i++] = each;
             }
        System.out.println(Arrays.toString(students));

        System.out.println(".............");

        char [] ch1= {'a','b','c','d'};
        char []ch2= {'e', 'f','g'};

        char[] chars=new char[ch1.length+ch2.length];

        int j=0;//this value will be index number of new array

        for(char each: ch1) {
            chars[j++] = each;
        }
        for(char each: ch2) {
            chars[j++] = each;
        }
        System.out.println(Arrays.toString(chars));
        }

             }


