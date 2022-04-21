package day42_ExceptionContinue;


class FadyException extends RuntimeException{
    public FadyException(){
        System.out.println("it is time for ");
    }

}

public class CustomExceptions {
    public static void main(String[] args) {

        throw new FadyException();
    }
}
