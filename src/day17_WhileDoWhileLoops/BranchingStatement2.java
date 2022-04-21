package day17_WhileDoWhileLoops;

public class BranchingStatement2 {
    public static void main(String[] args) {

        for(char i='A'; i<='E'; i++) {
            if (i == 'C') {
                //break;
                continue;// it will be skipped character of 'C'
            }
            System.out.println(i);
        }
        System.out.println("...........");
        // Print ALL even numbers 1~10


        for (int i = 1; i <11 ; i++) {
            if (i%2!=0){
                continue;
            }

                System.out.println(i);
            System.out.println("...............");

            for (int j = 0; j < 11; j++) {//we are gonna look odd number
                if (j%2==0) {
                    continue;
                }
                System.out.println(j);

            }

            }



        }

            }



