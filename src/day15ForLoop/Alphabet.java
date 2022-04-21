package day15ForLoop;

public class Alphabet {
    public static void main(String[] args) {
        //A~Z, a~z,Z~A,z~a
        //Ascii table should be used==A~Z 65~90
        for(int i=65; i<=90;i++) {
            System.out.print((char) i + " ");//we are casting char
        }
        System.out.println();
        System.out.println(".............");

        for(char i='A';i<='Z'; i++ ){//i:A, B,C
            System.out.print(i+" ");
        }
        System.out.println("...............");
        for (char i='a'; i<='z'; i++){//i; a,b,c,d...
            System.out.print(i +" ");}

    }
}
