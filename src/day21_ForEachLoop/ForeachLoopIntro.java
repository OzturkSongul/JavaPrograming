package day21_ForEachLoop;

public class ForeachLoopIntro {
    public static void main(String[] args) {
        int[]numbers={10,20,30,40,50,60,70};

        //for (int i = 0; i < numbers.length; i++) {//i: indexes of the array
         //int eachElement= numbers[i];//to get each element
           // System.out.println(eachElement);this regular loop to get each element

        for(int each: numbers){//each element of array
            System.out.println(each);// for each loop
        }




        }
    }

