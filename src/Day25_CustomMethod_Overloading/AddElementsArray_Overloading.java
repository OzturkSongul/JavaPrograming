package Day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsArray_Overloading {
    public static void main(String[] args) {
        int[]numbers= {1,2,3,4,5,6};//want to add 7
        char[]chars={'a','b','c'}; // want to add 'd'
        String[]names={"Ahmet","Ayse","mehmet"};//want to add fatma

        numbers=addElement(numbers,7);
        chars=addElement(chars,'d');
        names= addElement(names,"fatma");

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("chars = " + Arrays.toString(chars));
        System.out.println("names = " + Arrays.toString(names));

    }
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;//this is new array index number
        for (int each : array) { //to get elements of old Array
            result[i++] = each;//and assign the elements to new array index
        }
        result[i] = element;// whenever i stop it will be last index, so I can assign last index to new element
        return result;
    }

    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;//this is new array index number
        for (double each : array) { //to get elements of old Array
            result[i++] = each;//and assign the elements to new array index
        }
        result[i] = element;// element need to be assigned to the last index
        //result[result.length-1]=element;
        return result;
    }

    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;//this is new array index number
        for (String each : array) { //to get elements of old Array
            result[i++] = each;//and assign the elements to new array index
        }
        result[i] = element;// element need to be assigned to the last index
        //result[result.length-1]=element;
        return result;
    }

    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;//this is new array index number
        for (char each : array) { //to get elements of old Array
            result[i++] = each;//and assign the elements to new array index
        }
        result[i] = element;// element need to be assigned to the last index
        //result[result.length-1]=element;
        return result;


    }
}








