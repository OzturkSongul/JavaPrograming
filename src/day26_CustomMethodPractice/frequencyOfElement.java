package day26_CustomMethodPractice;

public class frequencyOfElement {

    //returns the frequency of the given element from the given array
    public static int frequencyElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;

            }
        }
        return count;

    }

    //returns the frequency of the given element from the given array
    public static double frequencyElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;

            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;

            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;

            }
        }
        return count;
    }
}

