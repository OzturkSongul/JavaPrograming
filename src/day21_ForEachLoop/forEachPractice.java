package day21_ForEachLoop;

public class forEachPractice {
    public static void main(String[] args) {
        String[]words= {"Java Programing", "Cydeo School", "Wooden Spoon","Early Birds", "Angry Birds"};
        //we want to reach first and last character of each element of the array

        for(String each:words){
            System.out.println(each.charAt(0)+ "" + each.charAt(each.length()-1));
        }






    }
}
