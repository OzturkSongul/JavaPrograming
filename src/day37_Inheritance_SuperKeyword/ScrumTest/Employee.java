package day37_Inheritance_SuperKeyword.ScrumTest;

public class Employee extends Person{

    public String jobTitle;
    public int ID;
    public double salary;
    public String companyName;

    public Employee(String name, int age, char gender, String jobTitle, int ID, double salary, String companyName) {
        super(name, age, gender);// inherited insatnce varible came otomaticlly
        this.jobTitle = jobTitle;// these are added variables
        this.ID = ID;
        this.salary = salary;
        this.companyName = companyName;
    }
    public void work(){
        System.out.println(name+ " is working");
    }

    public String toString() {
        return "Employee{" +

                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                "jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary= $" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }// in here we created to string method again because we need to print also added new variables
}
