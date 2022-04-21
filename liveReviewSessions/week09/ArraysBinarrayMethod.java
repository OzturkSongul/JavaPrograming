package week09;

import java.util.Arrays;

public class ArraysBinarrayMethod {
    public static void main(String[] args) {

        int[] nums={ -5,23,223,854,2344,23446};
        int indexOne =Arrays.binarySearch(nums, 23);//this statement returns index of 23

        System.out.println("indexOne= "+ indexOne);
        System.out.println(Arrays.binarySearch(nums,2344));
        System.out.println(Arrays.binarySearch(nums,25));// when number is not exist then it gives negative number

        if(Arrays.binarySearch(nums,23446)>=0) {
            System.out.println("23446 is present in array");
        }
        else{
            System.out.println("23446 is not present in array");

        }
        int[]nums2= {56,-76,100,1000};
        Arrays.sort(nums2);// in order to use binarySearch method, it needs to be sorted first
        System.out.println(Arrays.binarySearch(nums2, 1000));
        System.out.println(Arrays.binarySearch(nums2, 60));




    }
}
