package day37_Inheritance_SuperKeyword;

class A{

    public A(int a){// when partent class argument is default, it is done otomatically
        // but when there is a argumanet
        System.out.println("A");
    }
}
class B extends A{
    public B(){
        super(9); // when parent class has an argument we will do maullay super keyword
        // super()
        System.out.println("B");
    }
}


public class ConstructorPractice {
    public static void main(String[] args) {

        B obj =new B();

    }
}
