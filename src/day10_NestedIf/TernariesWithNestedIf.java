package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        int s=45;
       //if (s>=0 && s<=100);
        String result= (s>=0 && s<=100)? (s>=60)? "Passed": "failed":"invalid s";
        System.out.println(result);


    }
}
