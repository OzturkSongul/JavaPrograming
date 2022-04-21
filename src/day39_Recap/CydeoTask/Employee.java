package day39_Recap.CydeoTask;

public class Employee extends Person {


private int EmployeeID;
private String jobTitle;
private double salary;

    public Employee(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender);
       setEmployeeID((employeeID));// we are using set, for checking if there is a condtion
       setJobTitle(jobTitle);
       setSalary(salary);
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName()+ " is working");
// we couldnt use name directly, because it is not inheritanded so we use getter
    }

    @Override
    public String toString() {// in here we added new varibales to read
        return "Employee{" +
                "name='" + getName() + '\'' +// we added later other variables, but they are private so we use getter
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "EmployeeID=" + EmployeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}