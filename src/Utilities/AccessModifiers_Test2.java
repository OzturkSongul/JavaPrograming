package Utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers_Test2 {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        //System.out.println(AccessModifiers.defaultData); // defaoult is not visible outside of package
       // System.out.println(AccessModifiers.privateData); // private access modifier is not visible outside of class
    }
}
