package day16_ForLoopStringPractice;

public class reverse {

    public static void main(String[] args) {
        String str="Wooden Spoon";
        //index:    0123456...

        String result="";//contain the reversed version of str
        //n
       /* result+=str.charAt(str.length()-1);//n,+ using because we want to add n to back to result.
        result+=str.charAt(11);//n
        result+=str.charAt(10);//o
        result+=str.charAt(9);//o
        result+=str.charAt(8);//p
        result+=str.charAt(7);//S
        result+=str.charAt(6);//' '
        result+=str.charAt(5);//n
        result+=str.charAt(4);//e
        result+=str.charAt(3);//d
        result+=str.charAt(2);//o
        result+=str.charAt(1);//o
        result+=str.charAt(0);//w

        */
        for (int i=11; i>=0;i--){// i:index numbers of str (starting last index to index 0
            //for (int =str.length()-1;....   ){ // the last index will be starting point of loop

              result+=str.charAt(i);//adding each chacracter to result



        }




        System.out.println(result);











    }
}
