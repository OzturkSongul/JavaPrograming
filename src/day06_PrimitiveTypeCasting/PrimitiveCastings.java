package day06_PrimitiveTypeCasting;

public class PrimitiveCastings {
    public static void main(String[] args) {
        byte a= 100;
        short b= a;
        // (short)a
        int c= b;// implicit casting
        //int c= (int)b
        long d= c;
        // (long)c
        float e=d;
        double f= e;
        System.out.println("..............");
        int x = 55;
        short y= (short)x;
        System.out.println(x + ":" + y);

        long j = 1000000;
        short k = (short)j;
        System.out.println(j + ":" + k);


        double l= 2.5;
        float n= (float)l;
        System.out.println(l + ":" +n);
        double m= 10.8;
        int s= (int)m;
        System.out.println(m + ":" +s);
        System.out.println(";;;;;;");

        double d1= 20.5;
        short s1= (short) d1;

        double d2= 34.7;
        short s3= (short) d2;
        System.out.println(d1 + ":" +s1);
        System.out.println(d2 + ":" + s3);

        float f1= 30.5F;
        long l1= (long) f1;





    }






}
