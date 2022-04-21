package Day24_CustomMethodReturnMethod;

public class ReturnMethodiNTRO {
    public static void main(String[] args) {

        String str= "java";
        String result=reverse(str);

        System.out.println(result);
        if(str.equalsIgnoreCase(result)) {// in here we are checking if the word is palindrome or not
            System.out.println(str + " is palindrome");
        }
        else{
            System.out.println(str+ "is not palindrome");
        }

    }

    public static String reverse(String str) { //"java"
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);//with char method we will get each character
        }
        return reverse;


    }
}
// first we get reverse version with loop and charAt, and in return method part, we got reverse version.
// then in main method part revresed version









