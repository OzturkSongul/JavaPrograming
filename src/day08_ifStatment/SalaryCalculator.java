package day08_ifStatment;

public class SalaryCalculator {

    public static void main(String[] args) {

            int hourly =50,
                weeklyHours= 45;
        double stateTaxRate= 6.5,
              federalTaxRate= 26.2;

        int salaryBeforeTax= hourly*weeklyHours*52;
        double stateTax= salaryBeforeTax* stateTaxRate / 100;
        double federalTax= salaryBeforeTax*federalTaxRate /100;
        double totalTax= stateTax+ federalTax;
double salaryAfterTax= salaryBeforeTax-totalTax;

        System.out.println("Gross pay is : $"+ salaryBeforeTax);
        System.out.println("StateTax : $ " +stateTax);
        System.out.println("FedaralTax  : $ " + federalTax);
        System.out.println(" net Income  : $ " + salaryAfterTax);
    }
}
