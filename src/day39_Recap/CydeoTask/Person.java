package day39_Recap.CydeoTask;

public class Person {

    private String name;
    private int age;
    private char gender;



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {// to make sure all classes related with person have name, gender, age we set consturctor
        setName(name);// giving set in constructor is good to check if requirements have
        setAge(age);
        setGender(gender);
    }

    public void eat() {
        System.out.println(name + " is eating");
    }
    public void drink() {
        System.out.println(name + " is drinking");
    }
    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    @Override
    public String toString() {// to print all information for every single person
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
