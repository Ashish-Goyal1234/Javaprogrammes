package NestedClasses;
    class ou{
        class inn{
            static int a = 10;   // Static not allowed in inner classes.
            // Static variable, Static methos, blocks are not possible.
            
            final static int b=20;  // but allowed for constant variable declaration e.g final variable.
        }
    }

public class Case4_StaticNotAlloedInInnerClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
