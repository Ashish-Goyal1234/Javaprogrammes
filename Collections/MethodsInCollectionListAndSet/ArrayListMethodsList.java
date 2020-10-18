package MethodsInCollectionListAndSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

    /*
              Different ways we are fetching values from ArrayList :
              1. Java 8 for each loop using lamda expression.
              2. for each loop
              3. Iterator
              4. List Iterator
              5. for Loop
              6. While loop
     */
public class ArrayListMethodsList {

    public static void main(String[] args) {
                ArrayList<Product> p = new ArrayList<Product>();
                p.add(new Product(10, "Table", 1000));
                p.add(new Product(5, "Pen", 10));
                p.add(new Product(15, "Chair", 1500));
                p.add(new Product(3, "Book", 100));
                Product ob = new Product(11, "Paper",20);
                p.add(ob);
          p.get
                
                ArrayList<Product> p1 = new ArrayList<Product>();
                p1.add(new Product(110, "TV", 50000));
                p1.add(new Product(120, "Fridge", 20000));
                p1.add(new Product(90, "Gyser", 10000));
                p1.add(new Product(150, "Washingmachine", 15000));
               
                
                //System.out.println("List of Products" + p);  // It will generate className@hashcode because object class toString() Executed.
                
                System.out.println("*********Using Java 8 for each loop and lamda expression********");
                p1.forEach(prd ->{
                    System.out.println(prd.productID + " "+prd.productName);
                });
               
                System.out.println("****************Printing List of Product in ArrayList using For Each Loop******************");
                for(Product pp : p) {
                    System.out.println(pp.productID +" "+ pp.productName+ " " + pp.productCost);    // Insertion Order Preserved
                }
                
               p.add(new Product(2, "Fan", 500));
               System.out.println(p.contains(ob));
               p.addAll(p1);
               System.out.println(p.containsAll(p1));
               System.out.println(p.indexOf(ob));
               System.out.println(p.isEmpty());
               p.remove(3);
           
                System.out.println("***************Printing List of Products in ArrayList using Iterator************");      
                Iterator<Product>i = p.iterator();
                while(i.hasNext()){
                    Product i1 = i.next();
                    System.out.println(i1.productID+ " "+ i1.productName + " "+ i1.productCost); // Insertion Order Preserved
                }
                             
                System.out.println("***************Printing List of Products in ArrayList using ListIterator************");      
               ListIterator<Product> lt =  p.listIterator(p.size());   // Printing data in backward direction.
               while(lt.hasPrevious()){
                   Product prod = lt.previous();
                   System.out.println(prod.productID + " "+ prod.productName+" " + prod.productCost);
               }
                
                System.out.println("***************Print List of Products in ArrayList using for loop****************");
                int count = p.size();
                for(int j=0;j<count;j++){
                   int id = p.get(j).productID;
                   String name = p.get(j).productName;
                   int cost = p.get(j).productCost;
                   System.out.println(id + " " + name + " " + cost);   // Insertion Order Preserved.
                }
            
                
    }         
}
