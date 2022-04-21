package day23_CustomMethod;

public class task5_GradeCalculate {
    public static void main(String[] args) {
        grade(49);
    }


public static void grade(int number){
    if(number>=90 || number<=100){
        System.out.println("your grade is A");}
    else if (number>=80 || number<=89) {
        System.out.println("your grade is B");
    }
    else if(number>=70 || number<=79) {
        System.out.println("your grade is C");
    }
    else if(number>=60 || number<=69) {
        System.out.println("your grade is D");
    }
    else{
        System.out.println("your grade is fail");
    }
}
}