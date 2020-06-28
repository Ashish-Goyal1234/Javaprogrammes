package Variables;

/*
    Problem Statement:
    class Test{
            2 instance variable
            static void m1(){
                    print 2 variable
            } 
            public static void main(string[] args){
                call m1();
                 call m2();
            }
   }
 */
public class Assignmet1 {

    int a =100;  // instance variable
    int b=200; // instance varaiable
    
    static void m1(){
        Assignmet1 t = new Assignmet1();
        System.out.println(t.a);
        System.out.println(t.b);
    }
    
    static void m2(){
        Assignmet1 t2 = new Assignmet1();
        System.out.println(t2.a);
        System.out.println(t2.b);
    }
    public static void main(String[] args) {
        Assignmet1.m1();
        Assignmet1.m2();
    }
}
