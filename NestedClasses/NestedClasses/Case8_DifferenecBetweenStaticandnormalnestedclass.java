package NestedClasses;


//normal inner class
class outer{
    int a = 10;
    static int b=20;
        class inner{
            void m1(){
                System.out.println(a);  //Poassible
                System.out.println(b);  //Possible
            }
        }
}

// a. can access both static and instace members.
// b. Static declarations are not possible.
// c. main method, static blocks not possible.
// d.outer.inner i = new outer().new inner();



//Static inner class
class outer1{
  int a = 10;
  static int b=20;
      static class inner{
          void m1(){
              System.out.println(a);  //not Poassible
              System.out.println(b);  //Possible
          }
      }
}

//a. can access only static members.
// b. Static declarations are possible.
//c. main method, static blocks  possible.
//d.outer.inner i = new outer().inner();





public class Case8_DifferenecBetweenStaticandnormalnestedclass {

}
