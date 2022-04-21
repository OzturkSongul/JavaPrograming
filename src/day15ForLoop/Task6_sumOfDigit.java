package day15ForLoop;

import java.util.Scanner;

public class Task6_sumOfDigit {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter your word");
        String word= input.next();

int sum=0;

        for (int i = 0; i <word.length() ; i++) {

            char ch = word.charAt(i);
            if (ch >= '0' && ch <= '9') {
                sum += ch - 48;
            }
        }
        System.out.println("sum = " + sum);
            }
        }

