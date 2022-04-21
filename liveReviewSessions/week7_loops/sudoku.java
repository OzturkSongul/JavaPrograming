package week7_loops;

public class sudoku {
    public static void main(String[] args) {
        /*
        1
        2 6
        3 7 10
        4 8 11 13
        5 9 12 14
         */

        int rowCount=10;
        for (int row= 1;row<=rowCount; row++) { // this part for row, it is going to be 1,2,3..


            int value= row;//here we are working on clomn
            for (int col = 1; col <=row ; col++) {
                System.out.print(value +" ");
                value+= rowCount-col; // adding 4 for col 1, adding 3 for col 2

            }
            System.out.println();
        }
    }
}
