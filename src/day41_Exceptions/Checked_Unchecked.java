package day41_Exceptions;

import day39_Recap.CydeoTask.Student;

import java.io.FileInputStream;

public class Checked_Unchecked {
    public static void main(String[] args) {

        // unchecked exception:

        int a= 10;
        int b=0;

        // System.out.println(a/b);
        //
        //System.out.println("wooden spoon");

        char[]charcater= {'A','B','C'};

       // System.out.println(charcater[99]);

        Student student= null; // object is not exist
       // System.out.println(student.getName());

        //student.study();

        // any instance variable or method we need object

        final String str= "wooden Spoon";
        //str= null;// there is no object for str, so it is garbage collection
// for avoid garbage collection we use final word
        System.out.println(str.toUpperCase());

        String str2= "";// it is not same with null, even though empty still it is a object
        System.out.println(str2.isEmpty());


        // checked Exception

        System.out.println("hello word");

        //Thread.sleep(3000);// sleep method will wait

        System.out.println("Cydeo");

        //FileInputStream file= new FileInputStream("path of the file");


    }
}
