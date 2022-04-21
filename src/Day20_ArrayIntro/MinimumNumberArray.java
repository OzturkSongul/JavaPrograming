package Day20_ArrayIntro;

public class MinimumNumberArray {
    public static void main(String[] args) {

        int[]numbers={2,9,1,5,8};
        int minumum= numbers[0];//we assume fisrt element is minumum

        for (int i = 0; i <numbers.length ; i++) {//we are looking every single elemenet via loop
            if(numbers[i]<minumum) {//then we compare in loop
                minumum = numbers[i];//when minumum number found assigned to minumum
            }
            }
        System.out.println(minumum);
        }
    }

