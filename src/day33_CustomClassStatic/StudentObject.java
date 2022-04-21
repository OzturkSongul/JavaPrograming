package day33_CustomClassStatic;

import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {


        Student student1 = new Student("ahmet");
        Student student2 = new Student("ayse", 'F');
        Student student3 = new Student("fatma", 'F', 21);
        Student student4 = new Student("Mustafa", 'M', 23, 535);
        Student student5 = new Student("ali", 'M', 34, 456, 'A');


        System.out.println(student1 == student2);

        Student[] students = {student1, student2, student3, student4, student5};

        System.out.println(Arrays.toString(students));


    }
}
