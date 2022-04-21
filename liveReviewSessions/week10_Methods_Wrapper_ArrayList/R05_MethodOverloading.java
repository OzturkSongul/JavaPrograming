package week10_Methods_Wrapper_ArrayList;

public class R05_MethodOverloading {

    //I will as parameter either inshes and feet together... return value in centimeters

    public static double convertBritishToMetric(double feet, double inches){
        //1 feet =12 inches;

        if(feet<0 || inches> 12) {
            System.err.println("invalid feet or inches");
            return -1;
        }
        return feet*12*2.52 + inches* 2.52;
    }
    }






