package day37_Inheritance_SuperKeyword.animalTask;

public class AnimalObject {
    public static void main(String[] args) {

        Dog dog1 = new Dog("max", 'm', 12, "small", "black");
dog1.bark();
        System.out.println(dog1);

        Cat cat1 = new Cat("love", 'F', 23, "large", "white");
        System.out.println(cat1);

    }
}
