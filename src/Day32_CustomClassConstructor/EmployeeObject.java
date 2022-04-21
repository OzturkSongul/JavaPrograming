package Day32_CustomClassConstructor;

public class EmployeeObject {

    public static void main(String[] args) {

       Employee employee1=new Employee("songul");
        System.out.println(employee1);
        Employee employee2= new Employee("songul", 'F');
        System.out.println(employee2);
        Employee employee3= new Employee("mustafa", 'M', "sdet");

        System.out.println(employee3);
    }
}
