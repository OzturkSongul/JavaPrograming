package week8_overwiew;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {

        int []nums={ 5,10,4,1000,35};

        System.out.println("before reverse : "+ Arrays.toString(nums));

        for (int i = 0; i < nums.length/2 ; i++) {
            int temp = nums[i];//5
            nums[i] = nums[nums.length - 1 - i];//assing 1000 to first index
            nums[nums.length - 1 - i] = temp;
        }
        System.out.println("after reverse: " + Arrays.toString(nums));

        // Arrays.sort(nums); sorting your element from smaller than larger

        int[]numstwo={4,5,6,7,8};

        }
    }

