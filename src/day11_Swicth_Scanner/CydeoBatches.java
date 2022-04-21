package day11_Swicth_Scanner;

public class CydeoBatches {
    public static void main(String[] args) {
        String batchType="EU";

        switch(batchType) {
            case "US Morning":
                System.out.println("Class times are: 10-5 EST.M,T,Th,F");
                break;
            case "US Evening":
                System.out.println("Class times are: 7-10 EST.M,T,W,Th,S,S");
                break;
            case "EU":
                System.out.println("Class times are: 10-5 EST. M,T,W,Th,F");
                break;
            default:
                System.out.println("Invalid Batch");


        }
        }

        }


