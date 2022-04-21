package day21_ForEachLoop;

public class UniqueElement {
    public static void main(String[] args) {

        String[] words = {"java", "java", "c#", "Python", "Python"};
        //we are gonna look how many time for each element

        for (String each : words) {


            int count = 0;
            for (String element : words) {//for each element of array
                if (element.equals(each)) {
                    count++; //we need this for each element, so we use for each
                }

            }
       if (count==1){
           System.out.println(each);

       }

        }
    }
}

