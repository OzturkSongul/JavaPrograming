package day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {


        Employee employee1 = new Employee("songul", 'k', -28, 10000);
        System.out.println(employee1);

        employee1.setAge(32);
        System.out.println(employee1);

        Employee employee2= new Employee("aygun", 'f', 30, 120000);

        employee2.setName("ahmet");
        employee2.setSalary(employee2.getSalary()+15000);
      // we want to change second employye salary,we need to use setsalary for change.  first we obtain original salary with getsalary, then add

        System.out.println(employee2);
    }


}
