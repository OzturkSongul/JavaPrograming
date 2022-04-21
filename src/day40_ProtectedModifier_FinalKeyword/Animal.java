package day40_ProtectedModifier_FinalKeyword;

public class Animal {

    private String name;
    private final String breed;
    private final char gender;
    private String size;
    private int age;

    public Animal(String name, String breed, char gender, String size, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.size = size;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    // getter is for reading so beign final or not doenst effect the having getter

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // but in setter, only we can generate only if they are not final, because we couldnt change final

// how about create a setter for final variable

    public void setBreed(String breed){
        //this.breed=breed;// this for second time for setting breed, the first one is in the constructor

       // in custom class we can use final word, as long as we have variable that couldnt change

        }

        public void eat() {
            System.out.println(name + " is eating");
        }
        public final void drink() {// when we make it final, it means this implementation will be same for all animals
            System.out.println(name + "is drinking water");
        }


        }



