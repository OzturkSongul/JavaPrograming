package day27_WrapperClases;

public class wrapperClassesMethod {
    public static void main(String[] args) {

        String str= "123";
        int numb=Integer.parseInt(str);

        System.out.println(numb+1);//it is gonna add
        System.out.println(str+1);// it is gonna conceate

        String str2= "10.5";
        double number =Double.parseDouble(str2);
        System.out.println(number+1);// it is gonna add

        int max= Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        long max2= Long.MAX_VALUE;
        long min2=Long.MIN_VALUE;

        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);

        String s1= "true";
        boolean r1=Boolean.parseBoolean(s1);// convert String to primitive
        System.out.println(r1);

        String s2= "maybe";// as long as it is not true, return false
        boolean r2=Boolean.parseBoolean(s2);
        System.out.println(r2);

        System.out.println(".............");

        String s3= "123";
        Integer x =Integer.valueOf(s3);// convert String to wrapped class
        int y=Integer.valueOf(s3);
        System.out.println(x);
        System.out.println(y);

        String s4="1.5";
        double z=Double.valueOf(s4);
        System.out.println(z);

        System.out.println("...........");

        //isDigit()
        char ch1= '0';
        boolean r3= Character.isDigit(ch1);
        boolean r5= Character.isLetter(ch1);

        System.out.println(r3);
        System.out.println(r5);

        //isLetter()
        //speical char
        char ch2='!';

        boolean r4=!Character.isLetterOrDigit(ch1);

        //lowercase
       boolean r6= Character.isLowerCase(ch2);

        System.out.println(r4);
        System.out.println(r6);

        System.out.println("..............");

        String s= "ab1cd2efg3hi4";//get all digits

        int sum=0;
        for(char each:s.toCharArray()) {// to get each charatcter of string
            if (Character.isDigit(each)) {
                sum += each;
            }
        }
        System.out.println("sum = " + sum);

            }
        }








