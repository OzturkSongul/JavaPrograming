package Day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray2 {
    public static void main(String[] args) {

        int[][] array2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
        for (int i = array2D.length - 1; i >= 0; i--) {//i: index number of 1D arrays starting from last index

            //array2D[i]// if we want each 1D array from 2D array
            for (int j = 0; j <array2D[i].length ; j++) {//j: index number of element

                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();//to get each element of 2D array in seperate line

            }
        System.out.println(".............................");

        for (int i = 0; i < array2D.length; i++) {//i: index number of 1D array starting from 0

            for (int j = array2D[i].length - 1; j >= 0; j--) {
                System.out.print(array2D[i][j]+" ");//j: index number of each element starting from last index
            }
            System.out.println();

            }
        System.out.println(".................");

        for (int i = array2D.length - 1; i >= 0; i--) {

            for (int j = array2D[i].length - 1; j >= 0; j--) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();

            }

        }
            }














