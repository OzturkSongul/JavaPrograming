package day35_Encapsulation;

public class person {
    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings,numberOfHead;


    public person(String name, int age, char gender, String language) {
      this.name=name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    static{
        planet="Earth";
        isHuman=true;
        hasNose=true;
        numberOfHead=1;
        numberOfWings=0;

    }

    public static void printPlanet(){
        System.out.println("planet name is " + planet);
    }

    public void eat(){
        System.out.println(name +"is eating");
    }


}
