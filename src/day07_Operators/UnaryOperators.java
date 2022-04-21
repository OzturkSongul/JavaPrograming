package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1= +25;// it is optional operator
        int num2= -25; // it is mandatory to use


        System.out.println("..........");

        int a= 5;
        ++a; //pre increment : increases the value by 1 right away

        System.out.println(a);

        --a; // pre decrement : decrease the value by 1 right away
        System.out.println(a);

        int b= 100;
        System.out.println(++b);//pre increment increase the value right away
         int c= 100;
        System.out.println(c++); // post increment increase the value after next step

        System.out.println(c); // 101

        int x= 200;
        System.out.println(x--);
        System.out.println(x);
        System.out.println("................");

        int z= 45;
        System.out.println(++z);//46
        System.out.println(z++);//46
        System.out.println(z);//47

        int q= 30;
        System.out.println(--q);//29
        System.out.println(q--);//29
        System.out.println(q); //28





    }
}
