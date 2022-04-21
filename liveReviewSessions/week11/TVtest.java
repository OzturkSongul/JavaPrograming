package week11;

import java.awt.*;
import java.util.ArrayList;

public class TVtest {
    public static void main(String[] args) {

        TV Samsung=new TV();// new keyword invokes our constructor with no parameters
        System.out.println(Samsung.toString());

        Samsung.trunOn();
        Samsung.setVolume(3);
        Samsung.setChannel(7);
        System.out.println(Samsung);// toString is redundant

        TV LG= new TV();
        LG.setVolume(5);
        LG. setChannel(10);
        System.out.println(LG);

        LG.trunOn();
        LG.setVolume(5);
        LG.setChannel(10);
        System.out.println(LG.toString());

        TV Sony= new TV();
        //ArrayList

        ArrayList<TV>tvList= new ArrayList<>();
        tvList.add(Samsung);
        tvList.add(LG);
        tvList.add(Sony);

        for(TV each:tvList){
            System.out.println("is the TV on ?" +each.on);
        }
    }
}
