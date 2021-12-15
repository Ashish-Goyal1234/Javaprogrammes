package MapConcept;

import java.util.Collection;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapWithComparatorforproductdata {

    public static void main(String[] args) {
        TreeMap<Product, Student> t = new TreeMap<Product, Student>(new myComparaInteger());
        t.put(new Product(1001, "Pen"), new Student(10, "ratan"));
        t.put(new Product(1003, "Book"), new Student(30, "anu"));
        t.put(new Product(1002, "Chair"), new Student(20, "durga"));
        t.put(new Product(1006, "Table"), new Student(15, "sravya"));
        
        System.out.println("************Printing key Set*****************");
        Set<Product>s  = t.keySet();
        for(Product p : s){
            System.out.println(p.pid + " "+ p.pName);
        }
        
        System.out.println("************Printing  Value*****************");  // Sorting will not work as Created sort method for products only.
        Collection<Student>s1 = t.values();
        for(Student stu :s1) {
            System.out.println(stu.sid +" " +stu.sname);
        }
    }
}

    


class myComparaInteger implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
       if(p1.pid==p2.pid){
           return 0;
       }else if(p1.pid >p2.pid){
           return 1;
       }else
           return -1;
    }
}