package day08_ifStatment;

public class MinNumber {
    public static void main(String[] args) {

        int n1 = 340;
        int n2= 300;
       boolean n1isMin= n1>n2;
       boolean n2isMin= n2>n1;
       boolean equal= n1==n2;

       if (n1isMin) {
           System.out.println(n2 + " is the minumum number");
       }
       if(n2isMin) {
           System.out.println(n1 + " is the minum number");
       }
       if (equal) {
           System.out.println(equal);
       }



        }
        }






