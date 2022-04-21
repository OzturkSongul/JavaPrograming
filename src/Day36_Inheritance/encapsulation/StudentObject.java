package Day36_Inheritance.encapsulation;

public class StudentObject {
    public static void main(String[] args) {

        Student student1= new Student("daniel", 29, 'M', "MIT");

        student1.setAge(39);// set will change the age

        System.out.println(student1);

    }
}
