package week11;

public class LocalVSInstance {
    public int a=4;// this one is global, you can change

    public void showDifference() {
        int a = 5;// this is a local to the method
        System.out.println(a);
    }

    public static void main(String[] args) {
        LocalVSInstance obj= new LocalVSInstance();// object
        System.out.println(".... coming from the method....");
        obj.showDifference();

        System.out.println("......coming from instance variable");
        System.out.println(obj.a);
        obj.a=1;// it can be chabnged
        System.out.println(obj.a);

    }
    }

