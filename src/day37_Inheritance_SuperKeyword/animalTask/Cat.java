package day37_Inheritance_SuperKeyword.animalTask;

public class Cat extends Animal{


    public Cat(String name, char gender, int age, String size, String color) {
        super(name, gender, age, size, color);
    }



    public void scracth(){
        System.out.println(name+" is scracthing ");
    }
}
