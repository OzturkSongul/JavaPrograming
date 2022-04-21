package day10_NestedIf;

public class Loans {
    public static void main(String[] args) {
      int salary= 80_000;
      int creditScore= 600;

      String result= (salary>60.000 && creditScore>650)? "Loan Approved"
              :"Loan Denied";
        System.out.println(result);

    }
}
