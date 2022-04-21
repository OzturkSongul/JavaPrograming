package Day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffer {
    public static void main(String[] args) {
        Offer offer1 =new Offer();
        offer1.setInfo("london","Amazon", "SDET", 10000,true,true,true, true);

            Offer offer2= new Offer();
            offer2.setInfo("leicester", "Cydeo", "QA", 120000, true, false, false,true);

            Offer offer3= new Offer();
            offer3.setInfo("Sutton", "Apple", "QE", 125000,true,true, true,true);

            Offer offer4= new Offer();
            offer4.setInfo("Potters Bar", "CapitalOne", "SM", 115000,false , false, true,true);
        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);


        Offer[]myOffers={offer1,offer2,offer3,offer4}; // now we have array

        ArrayList<Offer>fullTimeOffers=new ArrayList<>(Arrays.asList(myOffers));// we add this array to arraylist
                                       // only accept arraylist so we convert collection type

        fullTimeOffers.removeIf(p-> !p.isFullTime);// removes not fulltime

        System.out.println(fullTimeOffers.size());

        ArrayList<Offer>localOffers=new ArrayList<>(Arrays.asList(myOffers));

        localOffers.removeIf(p-> !(p.location.equals("Potters Bar") || p.location.equals("london")));
        System.out.println(localOffers.size());

        for(Offer localOffer:localOffers){
            System.out.println(localOffer.companyName+" :" +localOffer.salary);
        }





    }
}
