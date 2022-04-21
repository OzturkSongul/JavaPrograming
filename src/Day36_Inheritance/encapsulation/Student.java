package Day36_Inheritance.encapsulation;

public class Student {

    private String name;
    private int age;
    private char gender;
    private String schoolName;

    public static boolean isStudent=true;
    public static boolean isHuman=true;

    public Student(String name, int age, char gender, String schoolName) {
        setName(name);// with set now the condition will be checked
        setAge(age); // without set, the constructor is not checking condition
        setGender(gender);
       setSchoolName(schoolName);
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        if(age<5 || age>90){
            return;// with return we will exist method and countinuo
        }
        this.age=age;
    }


    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender=='M'|| gender=='F')){
            return;// exist method
        }
        this.gender = gender;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(name + "is studying");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
