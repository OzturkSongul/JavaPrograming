package day23_CustomMethod;

public class customMethodPractice {
    public static void main(String[] args) {
       helloWorld5Times();
        System.out.println("..........");
        helloCydeo5Times();
        evenNumbers();
    }

    //create a function that can print hello world 5 times
    public static void helloWorld5Times() {

        for (int i = 0; i <=5 ; i++) {
            System.out.println("hello world");

        }
        //create a function that can print hello Cydeo 5 times
    }
    //create function that can print hello cydeo 5 times==>helloCydeo5times
    public static void helloCydeo5Times(){
        for (int i = 0; i <=5; i++) {
            System.out.println("hello cydeo");
        }

        }

        //create a function that can print all the even numbers form 1-10
      public static void evenNumbers(){
          for (int i = 2; i <=10 ; i+=2) {
              System.out.println(i);

          }
      }


    }





