package Day25_CustomMethod_Overloading;

public class MainMethodOverloading {

    public static void main(String[] args) {
        System.out.println("String");// java will write this, because in java main method is building, so the first one is building one

    }
    public static void main(int[] args) {
        System.out.println("int");
    }
    public static void main(double[] args) {
        System.out.println("double");
    }
    public static void main(char[] args){
        System.out.println("char");
}
}
