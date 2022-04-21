package day34_GarbageCollection_AccessModifiers;

import Day32_CustomClassConstructor.ConsturctorCalls;

public class ConstructorVsStaticBlock {

    static {
        System.out.println("static block");// first will be printed
    }
    public ConstructorVsStaticBlock() {// this one is not executed, becaouse we didint create any object
        System.out.println("Consturctor");
    }

    public static void main(String[] args) {// then this will be executed
        System.out.println("main method");

        new ConstructorVsStaticBlock();// creating object for construtur
        new ConstructorVsStaticBlock();// we also use static these 3 oject, beacuse they have same value
        new ConstructorVsStaticBlock();
    }
    }

