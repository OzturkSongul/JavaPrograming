package Day28_ArrayList;

public class StronPassword {

    public static void main(String[] args) {

        String password = "Cydeo2900@";

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;//has upper case// this boolean is temporary
        boolean r3 = false;//has lower case
        boolean r4 = false;//has special char
        boolean r5 = false;//has digit

        char[] chars = password.toCharArray();//each chararter of array
// char array return char, so we can look each character
        for (char each : chars) {
            if (Character.isUpperCase(each)) {//wrapper class
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            } else {// special char
                r4 = true;
            }

        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        System.out.println("isStrongPassword = " + isStrongPassword);
    }

    public static boolean isStrongPassword(String password) {//custom method

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;//has upper case// this boolean is temporary
        boolean r3 = false;//has lower case
        boolean r4 = false;//has special char
        boolean r5 = false;//has digit

        char[] chars = password.toCharArray();//each chararter of array
// char array return char, so we can look each character
        for (char each : chars) {
            if (Character.isUpperCase(each)) {//wrapper class
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            } else {// special char
                r4 = true;
            }

        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;

    }
}


