package day39_Recap.CydeoTask;

public class Cydeo {
    public static void main(String[] args) {

        Developer developer= new Developer("ali", 25,'M',1, "java developer", 120000);
        Tester tester= new Tester("ahmet", 34, 'm', 2, "SDET", 23000);
        Teacher teacher= new Teacher("ayse", 23, 'F', 3, "Mentor", 240000);
        Student student= new Student("fatma", 21, 'F',8, "java " );

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("....................");

        developer.setAge(39);// if we want to change the age of developer
        System.out.println(developer.getAge());

        System.out.println(developer);

        System.out.println("...........");
        developer.work();// even though work method is common for employye they have different implementation
        tester.work();
        teacher.work();

        System.out.println("...............");
        developer.drink();
        developer.eat();
        developer.sleep();

        developer.fixingBugs();
        System.out.println("............");

        tester.drink();
        tester.eat();
        tester.sleep();

        tester.createTicket();

        System.out.println("..........");

        teacher.drink();
        teacher.eat();
        teacher.sleep();

        System.out.println("...........");



    }
}
