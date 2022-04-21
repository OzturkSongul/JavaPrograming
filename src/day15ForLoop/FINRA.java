package day15ForLoop;

public class FINRA {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%15==0){
                System.out.print("FINRA ");}//15,30,45,60..
                if (i%3==0){
                    System.out.print("FIN ");}//3,6,9...
                else if(i%5==0) {
                    System.out.print("RA ");//5,10,15...
                }
                else{ //1,2,4,7
                    System.out.print(i+" ");

                }
            }
        }
    }









