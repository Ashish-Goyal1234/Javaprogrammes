package MethodVSReturntype;

class Emp{ }
class Student{ }

public class Case2 {

    Emp m1(){
        System.out.println("Employee method");
        Emp e = new Emp();
        return e;
         //return new Emp();
    }
    
    Student m2(){
        System.out.println("Student Method");
        Student s = new Student();
        return s;
        // return new Student();
    }
    
    static String m3(){
        System.out.println("m3 method");
        return "ashish";
    }
    
    public static void main(String[] args) {
            Case2 t = new Case2();
            Emp e = t.m1();   // here we stored m1() value in EMP because m1() is return emp object value.
            System.out.println(e);  // return hashcode value as it calling toString() from object class
            
            Student s = t.m2(); // here we stored m2() value in Student  because m2() is return Student object value.
            System.out.println(s); // return hashcode value as it calling toString() from object class
            
           String s1 = Case2.m3(); // here we stored m3() value in String because m3() is return string object value.
           System.out.println(s1); // return hashcode value
    }

}
