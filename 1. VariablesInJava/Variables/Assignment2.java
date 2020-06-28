package Variables;

/*         class Test{
                  2 inst variable
                  2 static variable
                  void m1(){
                      print 4 variables
                  }
                  static void m2(){
                      print 4 variables
                  }
                  public static void main(String[] args) {
                    call m1();
                    call m2();
                }
         }   */      

public class Assignment2 {

        int a = 10;
        int b=20;
   static int c = 100;
   static int d = 200;
   
   void m1(){
       System.out.println(a);
       System.out.println(b);
       
       System.out.println(c);
       System.out.println(Assignment2.c);
       System.out.println(d);
       System.out.println(Assignment2.d);
   }
   
   static void m2(){
       Assignment2 t = new Assignment2();
       System.out.println(t.a);
       System.out.println(t.b);
       
       System.out.println(c);
       System.out.println(Assignment2.c);
       System.out.println(d);
       System.out.println(Assignment2.d);
   }
    public static void main(String[] args) {
        Assignment2 t = new Assignment2();
        t.m1();
       m2();
    }

}
