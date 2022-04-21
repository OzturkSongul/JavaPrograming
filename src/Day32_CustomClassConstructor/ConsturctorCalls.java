package Day32_CustomClassConstructor;

import java.util.concurrent.Callable;

public class ConsturctorCalls {

    public ConsturctorCalls() {
        //this();can not call itself
        System.out.println("default constructor");
    }

    public ConsturctorCalls(int a) {// for calling second constructor we used overloading, but it must have different parameters

        this();
        System.out.println("Constructor with argument");
        //this();it is not first step, gonna give complier

    }

    public ConsturctorCalls(String str) {

        //this(10);only call one constructor
        this(10);//, default constructor, constructor with int argument,then constructor with string
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {// creating object
        ConsturctorCalls obj1 = new ConsturctorCalls();

        System.out.println(".................");

        ConsturctorCalls obj2= new ConsturctorCalls(10);// it is gonna write first default, then write the second

        System.out.println("...............");

        ConsturctorCalls obj3= new ConsturctorCalls("songul");



    }
}


