package day40_ProtectedModifier_FinalKeyword;

public class Dog extends Animal {


    public Dog(String name, String breed, char gender, String size, int age) {
        super(name, breed, gender, size, age);
    }

    public void eat() {
        System.out.println(getName() + "is eating dog food");
        // in here we used eat method with different implementation
    }
    //public void drink() {// final method cant overriding method
        //System.out.println(getName() + " is drinking beer");
    }








