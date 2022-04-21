package week10_Methods_Wrapper_ArrayList;



public class WrapperClassExmaple {
    public static void main(String[] args) {


        int i1 = 100;
        Integer i2 = i1;//Autoboxing from primitive to object type

        Long i3 = (long) i1;//explicit

        Integer n1 = 300;
        int n2 = n1;// unboxing form object to primitive

        String str = "123";
        System.out.println(str+1);//1231

        int num= Integer.parseInt(str);
        System.out.println(num +1);// 124

        String price= "$27.16";
       price=price.substring(1);// we are not taking dolar character

        double priceInDouble=Double.parseDouble(price);
        System.out.println(priceInDouble);



        //difference between Integer.parcelInt(str) and Integer.valueOf(str)

        Integer num2= Integer.valueOf(str);// valueOf gives Wrapper clases
        System.out.println(num2 +1);//124

        char ch='a';
        boolean isDigit= Character.isDigit(ch);
        System.out.println("isDigit = " + isDigit);

        boolean isLetter= Character.isLetter(ch);
        System.out.println("isLetter = " + isLetter);

        String strTwo= "a1b2c3";
        // sum of the integer inside strTwo

        int sumofDigit=0;

      for(char each:strTwo.toCharArray()){//charar turns every character char, each is char// we are looking each element
          if(Character.isDigit(each)){
              sumofDigit+=Integer.parseInt(each+"");// each is here char, so with double quto we did string then with parsel method truned int

          }

        }
        System.out.println("sumofDigit = " + sumofDigit);

      String str3= "abc1234!~$efghi6789#$%ABCD";

      String letters="";
      String upperCaseLetter="";
      String loweCaseLetter="";
      String digits="";
      String specialChars="";

      for(char each:str3.toCharArray()) {// char each= primitive
          if (Character.isLetter(each)) { // wrapper class
              letters += each;
              if (Character.isUpperCase(each)) {
                  upperCaseLetter += each;
              } else {
                  loweCaseLetter += each;
              }
          } else if (Character.isDigit(each)) {
              digits += each;
          } else {
              specialChars += each;
          }
      }
        System.out.println("letters = " + letters);
        System.out.println("loweCaseLetter = " + loweCaseLetter);
        System.out.println("upperCaseLetter = " + upperCaseLetter);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);


              }
          }




