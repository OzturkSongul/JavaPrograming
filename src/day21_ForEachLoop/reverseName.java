package day21_ForEachLoop;

public class reverseName {
    public static void main(String[] args) {

        String[]classmates={"Fatma ozturk","Selma ozturk","Filiz ozturk","Alper ozturk","Emre ozturk","Mustafa ozturk","Suleyman ozturk"};

        for (String each : classmates) {//everyone single name

            String reverse="";

            for (int i = each.length()-1; i >=0 ; i--) {//reverses the string
                reverse += each.charAt(i);
            }
            System.out.println(reverse);

            }

        }




    }

