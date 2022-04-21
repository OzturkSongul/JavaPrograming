package day37_Inheritance_SuperKeyword.animalTask;

public class Dog extends Animal{

    public int a;

    public Dog(String name, char gender, int age, String size, String color) {
        super(name, gender, age, size, color);
        this.a=a;// we added a new variable, then we should add manually
    }
        public void bark(){
            System.out.println(name + " is barking");

        }
    }

