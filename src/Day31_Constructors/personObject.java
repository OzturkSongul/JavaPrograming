package Day31_Constructors;

public class personObject {
    public static void main(String[] args) {

        person person1=new person("ayse", 'F', 32);
        System.out.println(person1);

        person person2=new person("fatma",'F', 21);
        System.out.println(person2);
        person2.age=28;



    }
}
