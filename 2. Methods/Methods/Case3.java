package Methods;
class X{}
class Emp{}
class Y{}
class Student{}

public class Case3 {
    
    void m1(X x , Emp e){
        System.out.println("M1 method");
    }
    
    static void m2(Y y, Student s){
        System.out.println("M2 method");
    }

    public static void main(String[] args) {
        Case3 t = new Case3();
        X x  =new X();
        Emp e = new Emp();
        t.m1(x, e);
        
        Y y = new Y();
        Student s = new Student();
        Case3.m2(y, s);
    }

}
