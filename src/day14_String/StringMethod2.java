package day14_String;

public class StringMethod2 {

    public static void main(String[] args) {

        String str= "java is fun, I love learning Java";
           String str2= str.replace("java", "Python");
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email="JohnSmith@yahoo.com";
        email=email.replace("yahoo", "gamil");
        System.out.println("email = " + email);

        String sentence="Java Java Python Python C# C# C++ C++ Python Python Python";
        sentence=sentence.replace("Python", "");
        String sentence2= sentence.replace("Python", "");
        System.out.println("sentence = " + sentence);
        sentence2=sentence.replace("   ", " ");

        System.out.println("sentence2 = " + sentence2);

        System.out.println("sentence2 = " + sentence2);


        String word= "Dog Dog Dog Dog Dog Dog";
        String word2=word.replace("Dog", "Cat");
        System.out.println("word2 = " + word2);

        String s2= "C# is fun, C# is cool";
        s2= s2.replace(" C#", " Java");
        System.out.println("s2 = " + s2);

        String st3= "java";
        st3=st3.replace("a", "e");//jeve
        System.out.println("st3 = " + st3);
        System.out.println("....................");

        String result= " java java java java";
        result=result.replaceFirst("java", "Python");
        System.out.println("result = " + result);

      String result2= "C# is fun C# is cool";
      result2=result2.replaceFirst("C#", "java");
        System.out.println("result2 = " + result2);


    }
}
