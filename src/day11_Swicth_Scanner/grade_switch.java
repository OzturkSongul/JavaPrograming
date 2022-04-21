package day11_Swicth_Scanner;

import jdk.swing.interop.SwingInterOpUtils;

public class grade_switch {

    public static void main(String[] args) {
        char ch = 'A';
        String result = "";
        switch (ch) {
            case 'A':
                //System.out.println("excellent");
                result = "excellent";
                break;
            case 'B':
                // System.out.println("great job");
                result = "Great Job";
                break;
            case 'C':
                //System.out.println("good");
                result = "good";
                break;
            case 'D':
                //System.out.println("passed");
                result = "passed";
                break;
            case 'F':
                //System.out.println("fail");
                result = "Fail";
                break;}
        System.out.println(result);


        }
    }





