package AbstractClasses;

abstract class parentClass{
      void m1(){             // Declare the method as static and then you are able to call this method as this method is overriden and also comes under abstract class.
           System.out.println("Parent class m1 method");    
     }
}

    class childClass123 extends parentClass {
         void m1(){
            System.out.println("Child Class m1 method");
        }
    }

public class Example7_AbstractClassMethodImplementation_InterviewQuestion{
   public static void main(String[] args) {
    parentClass p = new childClass123();
    p.m1();   // Not possible as this statement will call the child class m1().
   //  parentClass.m1(); // Another way is that Declare m1() of parent and child class as static and then call the method by using class name.
}
}
