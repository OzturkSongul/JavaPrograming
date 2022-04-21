package day37_Inheritance_SuperKeyword.PhoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone= new Iphone("iphone12", "small",12000,"black");

        Samsung samsung =new Samsung("galaxy23", "large",1000,"white");

        Nokia nokia= new Nokia("brick", "small", 2300, "gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123444);

        System.out.println("..........");
        samsung.call(6555);
        samsung.text(23456);
        samsung.freeze();

        System.out.println(".........." );

        nokia.call(2345678);
        nokia.text(1232);
        nokia.selfDefense();
        System.out.println("..........");

        System.out.println(iphone.hasBattery);// static varibale
        System.out.println(samsung.hasBattery);
        System.out.println(nokia.hasBattery);
        System.out.println(Phone.hasBattery);// parent class



    }
}
