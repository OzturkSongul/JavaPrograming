package day10_NestedIf;

public class Ternaries {

    public static void main(String[] args) {
        //ternaries: shortcut of if statement
        //if:(condtion)?
        //else:        :
        //else if: (condition):?

        int n = 0;


        String result1 = (n % 2 == 0)? "even" : "odd";
        System.out.println(result1);

        System.out.println("...............");

        int age = 23;
        if(age>=21){
            System.out.println("eligible");}
        else {
            System.out.println("not eligible");
        }

        String result2 = (age >= 21) ? "eligible" : "Not Eligible";
        System.out.println(result2);

        System.out.println("....................");

        int number=0;
        /*if(number>0) {
            System.out.println("pozitive");//string
        }
        else{
            System.out.println("negative");}//string
          */
        String result3= (number>0)? "Pozitive" : (number<0)? "negative" : "zero";
        System.out.println(result3);

        }
    }


        //System.out.println((age>=21)? "eligible" :"Not Eligible");














