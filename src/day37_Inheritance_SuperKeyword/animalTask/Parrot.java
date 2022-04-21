package day37_Inheritance_SuperKeyword.animalTask;

public class Parrot extends Animal{

    public Parrot(String name, char gender, int age, String size, String color) {
        super(name, gender, age, size, color);
    }
    public void sing(){
        System.out.println(name+" is signing");
    }
}

