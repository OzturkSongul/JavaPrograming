package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class carObjects {
    public static void main(String[] args) {
        car car1=new car();// this is car object
        car1. setInfo("Toyoto","Carry","white", 2000, 35000);


        System.out.println(car1);


        car car2=new car(); // second car object
        car2.setInfo("nissan", "33lk", "balck",2020,45000);

        System.out.println(car2);

        car car3= new car();
        car3.setInfo("bmw", "A4", "grey", 2021, 55000);

        System.out.println(car3);

        // to put these objects in same place we need data structure

        car[]cars={ car1,car2,car3};// we created array, but we couldnt add or remove, so more efficeint is Arraylist

        ArrayList<car>CarsList= new ArrayList<>(); // this arraylist for cars
        CarsList.addAll(Arrays.asList(car1, car2, car3)); // we are adding car1 car2, car3
        // we converted collection type via asList
        // let us find each car is expensive, so we need loop

        for(car each: CarsList) {
            System.out.println(each.brand + " : " + each.price);
        }
        System.out.println("......................");


// remove bmw: 2005-2008, toyota: 1995-1997
        CarsList.removeIf(p-> p.brand.equals("bmw")&& p.year>=2005 && p.year<=2008);
        CarsList.removeIf(p-> p.brand.equals("toyoto")&& p.year>=1995 && p.year<=1997);


        }
    }


