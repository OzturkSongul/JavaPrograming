package Day22_MultiDimensionalArray;

import java.util.Arrays;

public class multiDimensionalArrayIntro {
    public static void main(String[] args) {
        String[]gruop1= {"john","joes", "james"};
        String[]group2= {"Aaron", "Shay", "Breanna"};
        String[]group3= {"Ayse", "tahir", "Aygun"};


        String[][]groups= new String[3][];//index 0,1,2, 3 is here number of array
        groups[0]= gruop1;
        groups[1]= group2;
        groups[2]=group3;

        System.out.println(Arrays.deepToString(groups));
        System.out.println("..................");

        /*
        {1,2,3}
        {4,5,6,7}
        {8,9,10,11}

    *///index of element  0 1 2   0 1 2 3   0 1 2  3   4
        int[][] array2D={{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        //index of array= 0          1          2

        System.out.println(Arrays.deepToString(array2D));

        System.out.println(Arrays.toString(array2D[1]));// 4,5,6,7//1 is index of array

        System.out.println(array2D[2][3]);//11// 2 is single dimensional array, 3 is element of array
    }
}
