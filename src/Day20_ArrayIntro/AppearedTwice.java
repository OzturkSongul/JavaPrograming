package Day20_ArrayIntro;

public class AppearedTwice {
    public static void main(String[] args) {

        char[] chars= {'A','A','A','B','C','C','D','D','D'};
        for (int j = 0; j < chars.length; j++) {//another loop for

         char ch=chars[j];//'A', will start here
        int frequency=0;

        for (int i = 0; i < chars.length; i++) {//to get every single element of chars
            if(chars[i]==ch){
            frequency++;


        }

        }
        if(frequency==2){
            System.out.println(ch);
        }

        }


    }
}
