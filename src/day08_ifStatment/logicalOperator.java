package day08_ifStatment;

import java.sql.SQLOutput;

public class logicalOperator {

    public static void main(String[] args) {
        String name= "Songul";
        int age=19;
        String citizen= "USA";
        boolean isEligible= age>=18 && citizen =="USA";
        System.out.println(name + " is eligible to vote:" +isEligible);
        System.out.println(";;;;;;;;;;;;;;;;;;");

        String name2="Yavuz Selim";
        int creditScore= 720;
        int age2= 23;
        int income=4000;

        boolean isEligible2= creditScore>=700 &&age2>=23 &&income>=6000;
        System.out.println( name + " is Eligible to loan : "+ isEligible);
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;");

        String name3= "Mustafa";
        int age3= 21;
        char gender= 'M';

        boolean isEligible3= age>=18 && (gender =='F'||gender =='M');

        System.out.println(name + " is eligible to register :"+ isEligible);


        String name4=" Hasan";
        String countryOfBirth= "UK";
        boolean marriedToUSCitizen= false;
        boolean isEligible4= countryOfBirth == "USA" || marriedToUSCitizen == true;
        System.out.println(name + " is eligible to apply for US citizenship :" + isEligible4);


        String student= "Anna";
        double gpa= 3.5;
        int familyIncome = 100000;

        boolean isEligible5= gpa>=3.5 || familyIncome<=6000;
        System.out.println( student + " is eligible for scholarship: " + isEligible);

        boolean result2= true;
        System.out.println("result2 = " + result2);
        boolean result3= !result2;
        System.out.println("result3 = " + result3);

        int score= 55;
        boolean passed = score >= 60;
        boolean failed=!passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);


    }
}
