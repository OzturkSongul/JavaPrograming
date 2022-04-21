package day29_ArrayListPractice;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100, 90, 87, 85, 65, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> GradeOfA = new ArrayList<>(scores);// 90-100
        GradeOfA.removeIf(p -> !(p >= 90 && p <= 100));
        System.out.println(GradeOfA);

        ArrayList<Integer> GradeOfB = new ArrayList<>(scores);

        GradeOfB.removeIf(p-> !(p>=80 && p<=89));
        System.out.println(GradeOfB);

        ArrayList<Integer>GradeOfC= new ArrayList<>(scores);
        GradeOfC.removeIf(p-> !(p>=70 && p<=79));
        System.out.println(GradeOfC);


        ArrayList<Integer>GradeOfF= new ArrayList<>(scores);
        GradeOfF.removeAll(GradeOfA);
        GradeOfF.removeAll(GradeOfB);
        GradeOfC.removeAll(GradeOfC);

        System.out.println(GradeOfF);






    }

    }



