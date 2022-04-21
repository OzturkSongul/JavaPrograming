package day30_CustomClass;

import java.util.ArrayList;

public class StudentObject {

    public static void main(String[] args) {

        Student student1= new Student();
        student1.setInfo("ayse", 'F', 20, 2210,'B');
        System.out.println(student1);

        Student student2= new Student();
        student2.setInfo("ahmet",'M',23,4567, 'A');
        System.out.println(student2);

        Student student3= new Student();
        student3.setInfo("fatma", 'F', 12,3456, 'D');

        Student student4= new Student();
        student4.setInfo("Ali", 'M', 34, 1234,'B');

        Student student5= new Student();
        student5.setInfo("Mustafa", 'M', 13, 7654, 'A');

        Student[]students= {student1,student2,student3,student4,student5};
        for(Student each: students) {
            System.out.println(each);
        }
        System.out.println("....................");

        ArrayList<Student>earlyBirds= new ArrayList<>();
        ArrayList<Student>angryBirds= new ArrayList<>();

        for(Student each: students){
            if(each.grade=='A') {
                earlyBirds.add(each);
            }
            else{
                angryBirds.add(each);
            }

        }
        System.out.println(earlyBirds);
        System.out.println(angryBirds);
        System.out.println(".................");

        Student[]students2= {student1, student2, student3,student4,student5};

        ArrayList<Student>femaleStudents=new ArrayList<>();
        ArrayList<Student>maleStudents=new ArrayList<>();

        for(Student each:students){
            if(each.gender== 'F') {
                femaleStudents.add(each);
            }
            else{
                maleStudents.add(each);

            }

        }
        System.out.println(femaleStudents);
        System.out.println(maleStudents);

    }
}
