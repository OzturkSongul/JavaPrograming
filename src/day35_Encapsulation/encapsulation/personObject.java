package day35_Encapsulation.encapsulation;

public class personObject {

    public static void main(String[] args) {

        person p1= new person();
        // p1.name="daniel";// give error beacouse it is private

        p1.setName("daniel");

        p1.setAge(-200);

        System.out.println(p1.getName()+": " +p1.getAge());

    }
}
