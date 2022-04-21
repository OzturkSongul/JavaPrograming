package day40_ProtectedModifier_FinalKeyword;

public class FinalVariable {

    final String birthday; // in instance varibale we couldnt use final
    // for get rid of colplier we need to set constructor

    final static String name;

    static {
        name="Batch 25";// as long as we set static block it dont give error in static variable
    }


    public FinalVariable(String birthday) {
        this.birthday = birthday;
    }



    public static void main(String[] args) {

        final double pi = 3.14;// final word will made it unchangable

        System.out.println("..............");

        FinalVariable obj= new FinalVariable("may/o1");
        System.out.println(obj.birthday);// we couldnt give another date for this variable




    }
}

