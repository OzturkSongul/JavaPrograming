package weekOfLLoop;

public class BasicLoopExample {
    public static void main(String[] args) {

        for (int i=0;i<=1000; i+=10) {//i= local variable, only works with loop
            // we are increasing by 10, this is the statement part// then java code will be appear
            System.out.println(i + " ");
        }
        System.out.println();

        int z=0;
        for(; z<=1000;){
            System.out.print(z+" ");
            z+=10;// this is another way to work with loop, we put initialization and iteration outside of parantez
            //
            System.out.println("................");
            int x=0;//global variable for the whole class
            for(; x<=1000; ){
                if(x%10==0) {
                    System.out.print(x + " ");
                }
                    x++;// another way, be aware of the order of initialization, corelation and iteration. before loop,
                // initialization created
                    //then loop condition ten statement, then iteration.
                }
            }

// difference: if we make the initialization outside the for loop, the variable z or x can be used within the entire class.
        //or when the initialization is made within the for loop as usual, then the z or x only belongs to the loop

        }
    }



