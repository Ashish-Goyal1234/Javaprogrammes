package CollectionByNaveen.ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

    public static <E> void main(String[] args) {

        int a[] = new int[3];   //Static array means size is fixed.(Max 3 int values can be stored).
        
    /*    // to solve this problem we use dynamic array --- arrayList
        1. Can contain Duplicate Values.
        2. Maintains Insertion Order.
        3. It is not synchronized
        4. Allows Random Access to fetch the element becuase It stores the values on bass of indexes.
        */
        
    
        
        
        ArrayList ar = new ArrayList(); // This is called non generics any type of data is stored.
        ar.add(10);
        ar.add(20);
        ar.add(30);     
        ar.add(40);
        ar.add(12.33);
        ar.add("Test");
        ar.add('a');
        ar.add(true);
        
        System.out.println(ar.size());   // Size of arraylist
        
       System.out.println(ar.get(3));   // Index of the array list
       System.out.println("contents"  + ar);
       
       // to print all values from arrayList :
       // 1. For Loop
       // 2. Iterator
       for(int i = 0; i< ar.size(); i++){
           System.out.println("Printing all the values:\n"+ar.get(i));
       }
    
       //generics vs nongenerics

       ArrayList<Integer> ar1 = new ArrayList<Integer>(); //This is called generics only Integer data is stored. (Wrapper class used)
       ar1.add(100);
       // ar1.add("Selenium");  This will give error because we have defined generics as Integer
       
       // ArrayList<String> ar1 = new ArrayList<String>();
       // ArrayList<Float> ar1 = new ArrayList<Float>();
       // ArrayList<Double> ar1 = new ArrayList<Double>();
       
       
       ArrayList<E> ar3 = new ArrayList<E>();   // When we are not sure what type of type we are going to get Integer, Float, Double then we use E.
       
       // Above in Main Method <E> is created.
       
       
       Employee e1 = new Employee("Ashish", 26, "QA");
       Employee e2 = new Employee("Abc", 27, "Dev");
       Employee e3 = new Employee("PQR", 28, "Sales");

       ArrayList<Employee> ar4 = new ArrayList<Employee>();
       ar4.add(e1);
       ar4.add(e2);
       ar4.add(e3);
       
       //Iterator to traverse all the values
       Iterator<Employee> it = ar4.iterator();
       while(it.hasNext()){
          Employee emp =  it.next();
          System.out.println(emp.name);
          System.out.println(emp.age);
          System.out.println(emp.dept);
       }

       //**********************************************************
       System.out.println("*******************************************");
       
       
       ArrayList<String> ar5 = new ArrayList<String>();
       ar5.add("Name 1");
       ar5.add("Name 2");
       ar5.add("Name 3");
       
       ArrayList<String> ar6 = new ArrayList<String>();
       ar6.add("Name 4");
       ar6.add("Name 5");
       ar6.add("Name 6");
       
       //addAll()
       
       ar5.addAll(ar6);   // Object of ar6 will get merge into ar5 means objects of ar5 and ar6 will going to execute.
       
       for(int i = 0; i< ar5.size(); i++){
           System.out.println(ar5.get(i));
       }
       
       System.out.println("*******************************************");

       //removeAll
       
       ArrayList<String> ar51 = new ArrayList<String>();
       ar51.add("Name 1");
       ar51.add("Name 2");
       ar51.add("Name 3");
       
       ArrayList<String> ar61 = new ArrayList<String>();
       ar61.add("Name 4");
       ar61.add("Name 5");
       ar61.add("Name 6");
       
       ar5.removeAll(ar6);  // Removes ar6 object from ar5
       for(int j = 0; j< ar5.size(); j++){
           System.out.println(ar5.get(j));
       }
       
       System.out.println("*******************************************");
       
       
       ArrayList<String> ar7 = new ArrayList<String>();
       ar7.add("test");
       ar7.add("Name 22");
       ar7.add("Name 33");
       
       ArrayList<String> ar8 = new ArrayList<String>();
       ar8.add("test");
       ar8.add("Name 55");
       ar8.add("Name 66");
       
       
       ar7.retainAll(ar8);       
       for(int i = 0; i< ar7.size(); i++){
           System.out.println(ar7.get(i));
       }
    }

}
