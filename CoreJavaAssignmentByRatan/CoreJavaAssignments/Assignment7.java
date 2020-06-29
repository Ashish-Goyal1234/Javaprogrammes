package CoreJavaAssignments;

   /* class Test{
        1 inst methd(X x, Y y, int a)
        1 static method(Emp e, double d)
        1 inst method(char ch, student s)
        1 static method(String s, float f)
        
        public static void main(){
            call 4 methods by passign arguments
        }
    }*/
class X{}
class Y{}
class Emp{}
class student{}
public class Assignment7 {


    void m1(X x, Y y, int a){
        System.out.println("m1 method");
        System.out.println(x+" "+ y+ " "+ " "+a);
        
    }
    
     static void m2(Emp e, double d){
        System.out.println("m2 method");
        System.out.println(e+" "+d +" ");
    }
     
     void m3(char ch, student s){
         System.out.println("m3 method");
         System.out.println(ch + " "+ s +" ");
     }
     
     static void m4(String s, float f){
         System.out.println("M4 method");
         System.out.println(s + " "+ f +" ");
     }
    public static void main(String[] args) {
        Assignment7 t = new Assignment7();
        X x = new X();
        Y y = new Y();
        t.m1(x, y, 10);
        
        Emp e = new Emp();
        Assignment7.m2(e, 10.6); 
        
        student s = new student();
        t.m3('a', s);
        
        Assignment7.m4("ashish",1.5f);
    }

}
