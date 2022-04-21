package Utilities;

import day40_ProtectedModifier_FinalKeyword.ProtectedAccessModifiers;

public class AccessModifiers_test4 extends ProtectedAccessModifiers {
    public static void main(String[] args) {

       // System.out.println(AccessModifiers_test4.name1);
        System.out.println(AccessModifiers_test4.name2);
// outside of package if there is a subclass, protected is visible in subclass

    }
}
