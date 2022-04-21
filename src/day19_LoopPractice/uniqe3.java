package day19_LoopPractice;

public class uniqe3 {
    public static void main(String[] args) {
        String str = "aabccdeef";
        String result ="";//bdf


        for (int j = 0; j < str.length(); j++) {

            char ch=str.charAt(j);
            int count =0;// represents the frequency of the ch


            for (int i = 0; i <str.length() ; i++) {//compares the ch that outer loop picked, with each character

                char each = str.charAt(i);// each ch of str

                if (ch == each){

                    count++;

                }

            }

            if ( count == 1 ){ // you will write outer loop
                result += ch;

            }

        }


        System.out.println("result = " + result);





    }
}

