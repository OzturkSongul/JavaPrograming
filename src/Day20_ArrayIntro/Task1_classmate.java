package Day20_ArrayIntro;

import java.util.Arrays;

public class Task1_classmate {
    public static void main(String[] args) {

        String []classmates={"Fatma ozturk","Selma ozturk","Filiz ozturk","Alper ozturk","Emre ozturk","Mustafa ozturk","Suleyman ozturk ","Cemalleddin ozturk","banar ozturk ", "Songul ozturk "};

        for (int i = 0; i < classmates.length; i++) {
            String initials= classmates[i].charAt(0)+"."+ classmates[i].charAt(classmates[i].indexOf(" ")+1);

            System.out.println(initials);

        }
    }
}
