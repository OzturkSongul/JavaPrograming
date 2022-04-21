package day26_CustomMethodPractice;

import java.util.Arrays;

public class removeElement1 {
    public static void main(String[] args) {

        int[] numbers = {100, 200, 300, 400, 500, 600};
        numbers = removeElement(numbers, 1);//we are assigning to a new array
        numbers = removeElement(numbers, 1);// then will be remove 300;

        System.out.println(Arrays.toString(numbers));
    }

// remove the index from the array, return to new array
//                                  {1,2,3,4,5,3}, 2= the result will be {1,2,4,5}
    public static int[] removeElement(int[] array, int index) { //for removing spesific element we need to know index and the elemen

        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index number:" + index);
            System.exit(0);
        }

            int[] result = new int[array.length - 1];//for having enough capasity for new array, since we are removing one element then it should be -1
            int j = 0; // this represent the index number of new array

            for (int i = 0; i < array.length; i++) {// i= index number of the array

                if (i == index) {//whenever index number is matched with each it means we are going to remove
                    continue;//skip element
                }
                result[j++] = array[i]; // the rest of the indexs after removing will assign to new array

            }
            return result;
        }


            //for each loop only check element, dont check index number, so if there are duplicated element it will be all
            //duplicated element. so we need to regular for loop which look index number

// remove the index from the array, return to new array
    public static double[] removeElement(double[] array, int index) { //for removing spesific element we need to know index and the elemen

        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index number:" + index);
            System.exit(0);
        }

        double[] result = new double[array.length - 1];//for having enough capasity for new array, since we are removing one element then it should be -1
        int j = 0; // this represent the index number of new array

        for (int i = 0; i < array.length; i++) {// i= index number of the array

            if (i == index) {//whenever index number is matched with each it means we are going to remove
                continue;//skip element
            }
            result[j++] = array[i]; // the rest of the indexs after removing will assign to new array

        }
        return result;
    }


//for each loop only check element, dont check index number, so if there are duplicated element it will be all
//duplicated element. so we need to regular for loop which look index number

// remove the index from the array, return to new array
    public static char[] removeElement(char[] array, int index) { //for removing spesific element we need to know index and the elemen

        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index number:" + index);
            System.exit(0);
        }

        char[] result = new char[array.length - 1];//for having enough capasity for new array, since we are removing one element then it should be -1
        int j = 0; // this represent the index number of new array

        for (int i = 0; i < array.length; i++) {// i= index number of the array

            if (i == index) {//whenever index number is matched with each it means we are going to remove
                continue;//skip element
            }
            result[j++] = array[i]; // the rest of the indexs after removing will assign to new array

        }
        return result;
    }


//for each loop only check element, dont check index number, so if there are duplicated element it will be all
//duplicated element. so we need to regular for loop which look index number

    // remove the index from the array, return to new array

    public static String[] removeElement(String[] array, int index) { //for removing spesific element we need to know index and the elemen

        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index number:" + index);
            System.exit(0);
        }

        String[] result = new String[array.length - 1];//for having enough capasity for new array, since we are removing one element then it should be -1
        int j = 0; // this represent the index number of new array

        for (int i = 0; i < array.length; i++) {// i= index number of the array

            if (i == index) {//whenever index number is matched with each it means we are going to remove
                continue;//skip element
            }
            result[j++] = array[i]; // the rest of the indexs after removing will assign to new array

        }
        return result;
    }
    }












