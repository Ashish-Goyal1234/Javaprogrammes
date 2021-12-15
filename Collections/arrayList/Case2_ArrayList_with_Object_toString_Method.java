
package arrayList;

import java.util.ArrayList;
/*
 1. Below Points conclude Arrays are type safe but collections are not type safe.
 2. Arrays are type safe because:
     int[] : can holds only int data.
     float[] : can holds only float data, this is called type safety.
 3. Collections are not type safe because ArrayList contains differnt type of data, because of this we face problems
                 1. Type checking
                 2. Type casting.
 4. There are some problems as collections is not type safe:
     1. Type checking
     2. Type casting
    */
public class Case2_ArrayList_with_Object_toString_Method {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        /*
         * 1. Below we are trying to print object type of Data (Employee,
         * Student). 2. When we try to print this type of data java internally
         * calls toString() means parent class toString() is executed for Emp
         * and Student. 3. Parent class of Emp and Student is Object class, so
         * object class to string() executed and it returns classname@hashcode.
         */
        al.add(new Employee(111, "Ashish"));
        al.add(new Student(222, "Student"));
        al.add("Name");
        al.add(10);
        al.add(null);

        System.out.println(al); // return classname@hashCode for object data
        System.out.println(al.toString()); // return classname@hashCode for object data.

        /* 1. to overcome proble for object data use foreach loop.
            2. We have used Object beacuse arraylist contains differnt types of data not same type of data.
            3. Object class can hold any type of data.
            4. Now Object interally contains differnt object, so we need to check the type of object.
            5. To check the type of object we have instanceOf operator.
         */
        for (Object o : al) {  // object class is used to hold all tyoes of data
            
            if(o instanceof Employee){
                Employee e = (Employee) o;
                System.out.println(e.eid);
                System.out.println(e.ename);
            }
            
            if(o instanceof Student){
                Student s = (Student)o;
                System.out.println(s.sid);
                System.out.println(s.sname);
            }

            if(o instanceof Integer){
                System.out.println(o);
            }
            
            if(o instanceof String){
                System.out.println(o);
            }
            
       /* Here if we write instanceof null we will get nullpointer exception 
           if(o instanceof null){
                System.out.println(0);
            }
            */
            
            // to overcome
            if(o==null){
                System.out.println(o);
            }
        }

    }

}
