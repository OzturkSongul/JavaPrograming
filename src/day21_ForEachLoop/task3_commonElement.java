package day21_ForEachLoop;

public class task3_commonElement {
    public static void main(String[] args) {

        int[] number1 = {1, 2, 3, 4, 5, 6, 7};
        int[] number2 = {2, 4, 6};

        int common = 0;
        for (int each : number1) {
            for (int element : number2) {
                if (each == element) {
                }
            }
            System.out.print(each + " ");
        }
        System.out.println();


                }

            }





