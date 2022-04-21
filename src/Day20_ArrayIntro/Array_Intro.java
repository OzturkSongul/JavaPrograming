package Day20_ArrayIntro;

import java.util.Arrays;

public class Array_Intro {

    public static void main(String[] args) {
        // create a variable that's capable enough to contain 5 names

       String []myGroup= new String[5]; // or after data variable
        //System.out.println(myGroup);//hashcode
        myGroup[0]="gunay"; //we use this way when we know how many element but dont know what kind of element

        myGroup[1]= "Neira";
        myGroup[2]= "Suat";
        myGroup[3]= "Hulya";
        myGroup[4]= "Mikael";
        System.out.println(Arrays.toString(myGroup));

        System.out.println("..................");

        String []days={"Monday", "Tuesday", "Wednesday","Thursday","Friday", "Saturday", "Sunday"};//use this type of use for when we know how many element and which element
        System.out.println(Arrays.toString(days));
        int number=5;

        if(number<1|| number>7) {
            System.err.println("invalid number");
            System.exit(0);
        }
        System.out.println(days[number-1]);
        }

    }

