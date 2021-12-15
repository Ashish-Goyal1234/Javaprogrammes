package cloningProcess;

// Initially class is not supporting cloning process, class must implements clonable Interface.

public class cloningprocess implements Cloneable {
    int a = 10;
    int b = 20;
    public static void main(String[] args) throws CloneNotSupportedException {
        cloningprocess c =new cloningprocess();
        System.out.println(c.a);
        System.out.println(c.b);
        
        /*
         * 1. Below Example we need to type cast because, we are creating clone object of cloningProcess class, but clone method return type is object class
         *    clobe() belongs to object class.
         */
        cloningprocess c1 = (cloningprocess) c.clone();   // c1 is cloning object.
        System.out.println("clonable object data created clone from heap memory :" + c1.a);
        System.out.println("clonable object data created clone from heap memory :" + c1.b);
       
    }

}
