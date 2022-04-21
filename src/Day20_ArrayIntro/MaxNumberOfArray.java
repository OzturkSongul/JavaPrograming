package Day20_ArrayIntro;

public class MaxNumberOfArray {
    public static void main(String[] args) {

        int[]numbers={10,5,4,20,1,0};
        int max= numbers[0];// we assume max number is zero

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max) {
                max = numbers[i];// we are assigning greater number to variable max

            }
        }
            System.out.println(max);
        }




    }

