package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // >,>=, <,<=

        boolean result1=200>40; //true
        System.out.println("result1 = " + result1);
        boolean result2= 300>=150;
        System.out.println("result2 = " + result2);//true
        boolean result3= 100>= 100;
        System.out.println("result3 = " + result3);//true
        boolean result4 = 300>= 500;//false
        System.out.println("result4 = " + result4);

        //credit score of 720
        int creditScore= 720;
        int score=745;
        boolean isElligible= creditScore>=720;

        System.out.println("isElligible = " + isElligible);

        boolean result5= 100<120;//true
        System.out.println("result5 = " + result5);


        int score1= 75;
        boolean hasFailed= score<=59;
        System.out.println("hasFailed = " + hasFailed);

        System.out.println(";;;;");

        int x= 100;
        int y= 200;
        boolean equal = x==y;
        System.out.println("equal = " + equal);

        boolean result8= "Muhtar"== "Good Guy";
        System.out.println("result8 = " + result8);

        boolean results9= 'A'=='a';
        System.out.println("results9 = " + results9);

        boolean result10= "java"=="java";
        System.out.println("result10 = " + result10);

        boolean results11= 100!=200;//does not equal
        System.out.println("results11 = " + results11);

        boolean resul12= "java"!= "Break";
        System.out.println("resul12 = " + resul12);

        boolean result13= 300!=300;
        System.out.println("result13 = " + result13);

        int a=3;
        int b= 2;
        long c= (a+b) * 2 / 3 % 2;
        System.out.println("c = " + c);

        long a1= 3_000L;
        double b1= (float)a;
        int c1= (short) b;
        System.out.println("c1 = " + c1);
        System.out.println( c %1000);

        int s= 10;
        int k= 3;
        System.out.println(10/3);














    }




}
