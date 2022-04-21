package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {

        String[]classmates={"Fatma ozturk","Selma ozturk","Filiz ozturk","Alper ozturk","Emre ozturk","Mustafa ozturk","Suleyman ozturk"};

        for (String each : classmates) {
            String initial= each.charAt(0)+"."+ each.charAt(each.indexOf(" ")+1);//always last name came after space,
            //so we need to find the character after space, plus 1 is this character

            System.out.println(initial);
        }





    }
}
