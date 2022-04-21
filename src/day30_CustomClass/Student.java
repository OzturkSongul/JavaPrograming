package day30_CustomClass;

public class Student {

    public String name;// here String name is instant variable
    public char gender;
    public int age;
    public int ID;
    public char grade;
    // here it is local variable
    /*public void setInfo(String name, char gender,int ID, char grade ){
        this.name= name;// this. is for calling instance variable
        this.gender= gender;
        this.age= age;
        this.ID=ID;
        this.grade=grade;
        */

    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    public void code() {
        System.out.println(name + " is coding");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

}


