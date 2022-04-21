package day41_Exceptions;

public class FinallyBlock {


    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        try {
            System.out.println(arr[10]);
            System.out.println("try block");
        } catch (RuntimeException e) {
            System.out.println("catch block");
            e.printStackTrace();
            System.exit(0);// we terminated block
        }finally{
            System.out.println("finally block");

            // when catch block couldnt executed then finally block will be
            // if we dont want to finally block is not executed, then we should terminate the block before finally block
        }
        // finally block, always gets executed regardless of the exception is beign handled or not handle
    }

}


