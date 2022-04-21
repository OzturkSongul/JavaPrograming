package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("main method");

    }
    static{ // it is gonna executed first, only runs one time
        System.out.println("Static block");
    }
    static{
        System.out.println("static block2");

    }
}
