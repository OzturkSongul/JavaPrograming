package day39_Recap.CydeoTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void fixingBugs() {
        System.out.println(getJobTitle() + " " + getName() + " is fixing bug");
    }

    @Override
    public void work() {// we got different implementation of the person class method
        System.out.println(getJobTitle() + " " + getName() + " is developing the application");
    }

    }

