package Day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {


//index of element            0 1 2   0 1 2 3         0 1 2  3  4
        int[][] array2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
        //index of array=          0          1          2

        for(int i=0; i<array2D.length; i++){//i represent numbers of single dimensional arrays
            //System.out.println(Arrays.toString(array2D[i])); i is here represent number of single dimensional array

            for (int j = 0; j <array2D[i].length ; j++) {//j is index number element, i represent each single array
                System.out.print(array2D[i][j]+" ");//"" is for space for each element

            }
            System.out.println();//if I want to seperate line after each array



        }

    }
}


