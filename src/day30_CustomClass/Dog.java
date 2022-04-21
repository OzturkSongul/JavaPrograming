package day30_CustomClass;

public class Dog {
    public String name;// this is instance variable
    public String breed; // we have different breed so I need copy of different breed
    public int age;
    public char gender;
    public String size;
    public String colour;

    public void setInfo(String dogName,String dogBreed, int dogAge, char dogGender, String dogSize, String dogColour){
        name=dogName;
        breed=dogBreed;
        age= dogAge;
        gender= dogGender;
        size= dogSize;
        colour= dogColour;

    }


    public void eat() { //when we write static it will be one copy for objects
        System.out.println(name + " is eating");// when we use static also other dogs are gonna eat
    }

    public void bark() {
        System.out.println(name + " is barking");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}








//what attributes, name,age, gender, breed, size//
// I want to have different name, difefrent size, different gender for every object, so I will have instance variable

//what actions need: eat(), play(),bark()
