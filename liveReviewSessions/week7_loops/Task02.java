package week7_loops;

public class Task02 {
    public static void main(String[] args) {
        /* write a java program to print the following patterns

           1
           10
           101
           1010
           10101
           101010

           again we have 6 rows, 6 colums
           patern: for add column print "1", for even column "0"
         */

        for (int i = 1; i <=6 ; i++) {//handles rows

            for (int j = 1; j <=i; j++) { //handles colums, here we dont want go for 6 column, I want stop with row number

                // we are gonna use ternary operator
                System.out.print(j % 2 == 0 ? 0 : 1);
            }
            System.out.println();
                
            }
            
        }
        
        
    }

