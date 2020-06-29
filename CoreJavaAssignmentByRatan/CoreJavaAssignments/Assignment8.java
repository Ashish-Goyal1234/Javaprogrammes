package CoreJavaAssignments;

     /*   class Test{
            1 inst method ---> return type float
             1-static method --> return type EMp
             1-inst method ----> return type Test
             1-static method-----> return type string
                     
             public static void main(string[] args){
                 call 4 methods, hold the return value and print the resturn value
             }
        }*/

class Emp1{}
public class Assignment8 {

    float m1(){
        System.out.println("m1 method");
        return 10.5f;
    }
    
    static Emp1 m2(){
        System.out.println("m2 method");
        Emp1 e = new Emp1();
        return e;
    }
    
    Assignment8 m3(){
        System.out.println("M3 method");
        return this;
        
    }
    
    static String m4(){
        System.out.println("m4 method");
        return "ashish";
    }
    public static void main(String[] args) {
        Assignment8 t = new Assignment8();
        float f = t.m1();
        System.out.println(f);
        
        Emp1 e = Assignment8.m2();
        System.out.println(e);
        
        Assignment8 t1 = t.m3();
        System.out.println(t1);
        
      String str =   Assignment8.m4();
      System.out.println(str);
    }
}
