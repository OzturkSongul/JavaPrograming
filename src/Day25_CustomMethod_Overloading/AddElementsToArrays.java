package Day25_CustomMethod_Overloading;

import java.sql.SQLOutput;
import java.util.Arrays;

public class AddElementsToArrays {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        arr = addInteger(arr, 5);
        System.out.println(Arrays.toString(arr));
        System.out.println("............");

        double[] arr2 = {1.5, 2.5, 4.5};
        arr2 = addDouble(arr2, 5.5);//want to add 5.5 below array
        System.out.println(Arrays.toString(arr2));
        System.out.println("..............");

        String[] names = {"Ali", "Fatma", "Ayse", "Mehmet"};// want include Ahmet name
        names = addString(names, "Ahmet");
        names = addString(names, "Mustafa");
        System.out.println(Arrays.toString(names));

        System.out.println("...............");
        char[] chars = {'a', 'b', 'c'};// want to add k
        chars = addchar(chars, 'k');
        System.out.println(Arrays.toString(chars));

    }

    public static int[] addInteger(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;//this is new array index number
        for (int each : array) { //to get elements of old Array
            result[i++] = each;//and assign the elements to new array index
        }
        result[i] = element;// whenever i stop it will be last index, so I can assign last index to new element
        return result;
    }

    public static double[] addDouble(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;//this is new array index number
        for (double each : array) { //to get elements of old Array
            result[i++] = each;//and assign the elements to new array index
        }
        result[i] = element;// element need to be assigned to the last index
        //result[result.length-1]=element;
        return result;
    }

    public static String[] addString(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;//this is new array index number
        for (String each : array) { //to get elements of old Array
            result[i++] = each;//and assign the elements to new array index
        }
        result[i] = element;// element need to be assigned to the last index
        //result[result.length-1]=element;
        return result;
    }

    public static char[] addchar(char[] array, char element) {
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


