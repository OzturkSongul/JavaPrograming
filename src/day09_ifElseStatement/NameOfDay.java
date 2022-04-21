package day09_ifElseStatement;

public class NameOfDay {

    public static void main(String[] args) {


        int num=5;
        String result= (num==1)? "Monday" : (num==2)? "Tuesday" : (num==3)? "Wednesday": (num==4)? "Thursday": (num==5)? "Friday" : (num==6)? "Satrurday" : "Sunday";
        System.out.println(result);
    }
}
