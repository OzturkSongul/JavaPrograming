package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObject {
    public static void main(String[] args) {

        Dog dog1 =new Dog();// the object of dog is cretaed

        dog1.name="Lucy";// we are storing data in the object
        dog1.breed="Husky";
        dog1.age=5;
        dog1.gender='F';
        dog1.size="Small";
        dog1.colour= "White";

        Dog dog2= new Dog();
        dog2.name="Ace";
        dog2.breed="Husky";
        dog2.age= 5;
        dog2.gender= 'M';
        dog2.size= "large";
        dog2.colour= "white &black";

        Dog dog3=new Dog();
        dog3.setInfo("jack","German", 2, 'M', "large", "Black");


        System.out.println(dog1);// the print will hacword means we dont have String method, need to go to dog class and create to string method
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();
        dog2.bark();

        Dog dog4=new Dog();
        dog4.setInfo("bullet", "Labrador", 3,'M', "Extra Large", "yellow");
        System.out.println(dog4);


        Dog dog5= new Dog();
        dog5.setInfo("Sully", "PitBuul", 4, 'M',"large", "Black");
        System.out.println(dog5);


        System.out.println("....................");

        Dog[]dogs= {dog1,dog2,dog3,dog4,dog5};

        // first we are gonna find which one is female and male, then add these dog to arraylist

        ArrayList<Dog>femaleDog= new ArrayList<>();
        femaleDog.addAll(Arrays.asList(dog1, dog2,dog3,dog4, dog5));

        ArrayList<Dog>maleDog=new ArrayList<>();
        maleDog.addAll(Arrays.asList(dog1,dog2,dog3,dog4,dog5));

        for(Dog each: femaleDog){
        }
    }
}
