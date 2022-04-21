package Day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog=new Dog();
        dog.setInfo("max",'M',2,"small", "black");
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();

        System.out.println(dog);

        Cat cat= new Cat();
        cat.setInfo("tarcin", 'M', 3,"large", "brown");
        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
        cat.meow();
        cat.scratch();
        System.out.println(cat);


        Tiger tiger= new Tiger();
        tiger.setInfo("Bengel", 'M', 4, "Large", "orange");
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();
        tiger.roar();
        tiger.hunt();
        System.out.println(tiger);
    }
}
