package Day20_ArrayIntro;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
      //store this elements: 10,20,50,70

        int[]numbers={10,20,50,70}; //size 4
        System.out.println(Arrays.toString(numbers));
        System.out.println(".....................");
        //create a variable that can store contain 5 scores

        int[] scores= new int[5];//the value will be 5 zero, because we didnt give any value
        scores[1]=85;
        scores[scores.length-1]=95;//4. number
        scores[3]= 75;
        scores[2]= 55;
        scores[0]=65;


        System.out.println(Arrays.toString(scores));

        System.out.println("...................");

        String[]month= {"January", "February", "March", "April", "May", "June",
        "July", "Agust", "September", "October", "November", "December"};// index number 0-11

/*
        System.out.println(month[0]);
        System.out.println(month[1]);
        System.out.println(month[2]);
        System.out.println(month[3]);
        System.out.println(month[4]);
        System.out.println(month[5]);
        System.out.println(month[6]);
        System.out.println(month[7]);
        System.out.println(month[8]);
        System.out.println(month[9]);
        System.out.println(month[10]);
        System.out.println(month[10]);
        System.out.println(month[11]);
        */ //this is long way, always use loop this cases

        for (int i = 0; i < month.length; i++) {//represent index number starting from 0
            System.out.println(month[i]);
        }


            System.out.println("...............");


        for (int i = month.length -1; i >=0 ; i--) { // i represent last index
            System.out.println(month[i]);
        }
                
            }

        }





