package day37_Inheritance_SuperKeyword.ScrumTest;

public class ScrumMaster extends Employee{

    public ScrumMaster(String name, int age, char gender,  int ID, double salary, String companyName) {
        super(name, age, gender,"Scrum Master", ID, salary, companyName);
    }
    public void arrangeMeeting(){
        System.out.println(name+ " is arranging meetings");
    }

}
