package day21_ForEachLoop;

public class Tas4_Palindrome {
    public static void main(String[] args) {

        String[] words={"Anna", "level","Java"};

        int count=0;//count icin bir variable olusturduk

        for(String each:words) {//here elememt icin foreach
            String reverse = "";//her elementin yeni hali icin variable olusturduk
            for (int i = each.length() - 1; i >= 0; i--) { // her element icin loop olusturduk, tersten baslayan
                reverse += each.charAt(i);// i son harfen baslayip her elemente eklendi
            }
            if (each.equalsIgnoreCase(reverse)) {// son olarak yeni hal ile her lementin eski hali
                count++;
            }
        }
        System.out.println(count);


            }
        }

