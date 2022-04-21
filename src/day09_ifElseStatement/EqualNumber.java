package day09_ifElseStatement;

public class EqualNumber {
    public static void main(String[] args) {
        int n1=3,
             n2=5,
             n3=3;
        if (n1==n2 && n1==n3) {
            System.out.println("all equal");
        }
        else if (n1==n2 && n1!=n2) {
            System.out.println("n1 & n2 are equal");
        }
        else if (n2==n3 && n2!=n3) {
            System.out.println("n2 & n3 are equal");
        }
        else if (n1==n3 && n1!=n2) {
            System.out.println("n1 & n3 are equal");
        }
        else{
            System.out.println("none of them are equal");
        }
    }
}
