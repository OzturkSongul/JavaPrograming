package day30_CustomClass;

import day29_ArrayListPractice.ReverseArrayAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class warmUpTask {
    public static void main(String[] args) {

        ArrayList<Integer>numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
// we are gonna swap fisrt and last index
        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);

        System.out.println(numbers.toString());

        System.out.println("................");
        ArrayList<Integer>list= new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(list);
        // we need to remove all zeros to end of the aeeay
        // when we know the remove element then we use removeall methdo
        // first we are gonna look at the number of zero

        int size=list.size();
        list.removeAll(Arrays.asList(0)); // all zeros will be removed
        System.out.println(list);// the list without zeros
        
        int newSize= list.size();// new size of list
        int totalNumberOfZeros= size-newSize;// now we now how many zero we need to add end of the list
        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros);
        for (int i = 0; i <totalNumberOfZeros ; i++) {// the loop will be executed numberof zero then everytime one zero will be added

            list.add(0);
        }
        System.out.println(list);

        System.out.println("......................");

        ArrayList<Integer>list2= new ArrayList<>();// second way of removing zeros and add to in the end of list
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer>result= new ArrayList<>();// new arraylist without zer

        for(Integer each: list2){
            if(each!=0) {
                result.add(each);
            }

            }

        for(Integer each: list2) {
            if (each == 0) {
                result.add(each);
            }
        }

        System.out.println(result);

        System.out.println("...................");

        String str= "ABCD123$%&456EFG!";
        // if we are gonna use split method will be string
        //if we use charat method it will return primitive

        ArrayList<Character> chars= new ArrayList<>();

        for (int i = 0; i <str.length() ; i++) {
            chars.add(str.charAt(i));// all element will be added new arraylist

        }
        ArrayList<Character>letters= new ArrayList<>(chars);// add all the character
        letters.removeIf(p-> !Character.isLetter(p));// remove the characters taht are not letters
        System.out.println("letters = " + letters);

        ArrayList<Character>digits= new ArrayList<>(chars);
        digits.removeIf(p-> !Character.isDigit(p));
        System.out.println(digits);

        ArrayList<Character>specialChar= new ArrayList<>(chars);
        specialChar.removeAll(letters);
        specialChar.removeAll(digits);

        //specialChar.removeIf(p-> Character.isLetterOrDigit(p));// second way for finding special chars in list


        System.out.println("specialChar = " + specialChar);





        }
        }



            







