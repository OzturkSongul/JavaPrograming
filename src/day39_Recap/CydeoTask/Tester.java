package day39_Recap.CydeoTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void createTicket() {
        System.out.println(getJobTitle() + " " + getName() + " is creating ticket");
    }

// in employee class in tostring method, name, gender, age all will be inheritanded tester class


    @Override
    public void work() {// when we want different implementtaion of a method we used overriding
        System.out.println(getJobTitle()+ " "+ getName()+ " is testing the application");
    }
}

