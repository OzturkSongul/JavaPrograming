package Day24_CustomMethodReturnMethod;

public class ReturnStatment2 {
    public static void main(String[] args) {
        String str1=grade(95);
        if (str1.equalsIgnoreCase("A")) {
            System.out.println("excellent");
        }else if(str1.equalsIgnoreCase("B")) {
            System.out.println("Great");
        }
        else if(str1.equalsIgnoreCase("C")) {
            System.out.println("Good");
        }
        else{
            System.out.println("Passed");
        }

        //create a function that can calculate the grade
        /*'A'= excellent
        'B'= great
        ...
         */

    }

    public static String grade(int score) {
        String result = "";

        if (score < 0 || score > 100) {
            result = "Invalid";
        } else {
            result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        }
        return result;


    }
}

