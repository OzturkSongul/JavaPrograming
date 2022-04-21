package Day28_ArrayList;

import java.util.ArrayList;

public class UniqueElement {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("java");
        list.add("java");
        list.add("java");
        list.add("Python");
        list.add("C#");
        list.add("C#");
        list.add("Ruby");
        list.add("C++");
        list.add("C++");

        //first find uniqe element then add to a new arraylist.

        System.out.println(list);

        ArrayList<String> unique = new ArrayList<>();

        for(String each: list){// to get each element

            if(list.indexOf(each)== list.lastIndexOf(each)){ // when we check first and last index of arraylist(each) then we can find if it is uniqe

                unique.add(each);// when element is unique then it will be added unique arraylist
            }

        }
        System.out.println(unique);

        System.out.println("......................");



    }
}
