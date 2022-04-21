package day30_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        Employee employee2=new Employee();
        Employee employee3=new Employee();
        Employee employee4=new Employee();
        Employee employee5=new Employee();

        employee1.setInfo("ayse", 'F', 25, 1234, "developer", 10000, true);
        employee2.setInfo("fatma", 'F', 23, 2345, "QA",2000,true);
        employee3.setInfo("ali", 'M', 34, 6789, "QA", 3000, true);
        employee4.setInfo("ahmet", 'M', 32, 5432, "manager", 120000, true);
        employee5.setInfo("Mustafa", 'M', 24, 1256,"Senior QA", 23000, true);


        Employee[]employees={employee1,employee2,employee3,employee4,employee5};

        int countFullTime=0; // how many emplooeye fulltime
        int countpartTime= 0;
        double max= employees[0].salary; // we are assuming fist employye has max salary
        double min=employees[0].salary; //assuming
        for(Employee each: employees){
            if(each.isFullTime){
                countFullTime++;}
            else{
                countpartTime++;
            }
            if(each.salary>max) {
                max = each.salary;
            }
            if (each.salary<min){
                min= each.salary;
            }

            }

        System.out.println(countFullTime);
        System.out.println(countpartTime);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
