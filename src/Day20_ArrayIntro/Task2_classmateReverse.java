package Day20_ArrayIntro;

public class Task2_classmateReverse {
    public static void main(String[] args) {

        String[]classmates={"Fatma ozturk","Selma ozturk","Filiz ozturk","Alper ozturk","Emre ozturk","Mustafa ozturk","Suleyman ozturk"};

        for (int i = 0; i < classmates.length; i++) {
            String name= classmates[i];
            String reverse="";

            for (int j =name.length()-1; j >=0 ; j--) {
                reverse += name.charAt(j);

            }
            System.out.println(reverse);
        }

        }


    }

