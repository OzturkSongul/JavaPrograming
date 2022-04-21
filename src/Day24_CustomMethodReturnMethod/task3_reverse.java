package Day24_CustomMethodReturnMethod;

public class task3_reverse {
    public static void main(String[] args) {
        reverse("java");

    }

    public static String reverse(String word){
        String reverse="";
        for (int i = word.length()-1; i >=0; i--) {
            reverse += word.charAt(i);

        }
        return reverse;
    }
}
