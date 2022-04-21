package week11;

public class AttsTest {
    public static void main(String[] args) {

        Atts atts=new Atts();//creating objects

        atts.name="cookings";
        atts.color= "black";
        atts.amount=10;

        System.out.println("atts.asString = " + atts.asString());

    }
}
