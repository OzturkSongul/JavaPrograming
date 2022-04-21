package day37_Inheritance_SuperKeyword.ScrumTest;

public class BusinessAnalayst extends Employee{

    public BusinessAnalayst(String name, int age, char gender,  int ID, double salary, String companyName) {
        super(name, age, gender, "Business Analyst", ID, salary, companyName);
    }
        public void analyse() {
            System.out.println(name + " is analyzing the documents");
        }

        }


