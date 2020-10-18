package MethodsInCollectionListAndSet;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorClassMethodList {

    public static void main(String[] args) {
        Vector<Product> v = new Vector<Product>();
        v.add(new Product(10, "Table", 1000));
        v.add(new Product(5, "Pen", 10));
        v.add(new Product(15, "Chair", 1500));
        v.add(new Product(3, "Book", 100));
        Product ob = new Product(11, "paper",20);
        v.add(ob);
        
        Vector<Product> v1 = new Vector<Product>();
        v1.add(new Product(110, "TV", 50000));
        v1.add(new Product(120, "Fridge", 20000));
        v1.add(new Product(90, "Gyser", 10000));
        v1.add(new Product(150, "Washingmachine", 15000));
       
        
        v.addAll(v1);
       // v.clear();
        System.out.println(v.contains(ob)); 
       System.out.println(v.containsAll(v1));   // Contains all elemnt of v1 refrence vector.
       System.out.println(v.indexOf(ob));
       System.out.println(v.remove(ob));
       System.out.println(v.isEmpty());
        
        System.out.println("**********Printing List of Products in Vector using for Each loop**********");
        for(Product p :v){
            System.out.println(p.productID + " "+p.productName+ " "+p.productCost);
        }
        
        
        System.out.println("***********Printing List of Product using Iterator*****************");
                Iterator<Product> p1 = v.iterator();
                while(p1.hasNext()){
                   Product p =  p1.next();
                   System.out.println(p.productID+" "+ p.productName+" "+p.productCost);
                }
                
         System.out.println("**********Printing List of Product using For Loop****************");
         int count = v.size();
         for(int i=0;i<count;i++){
             int id = v.get(i).productID;
             String name = v.get(i).productName;
             int cost = v.get(i).productCost;
             System.out.println(id+" "+name+" "+cost);
             }
         System.out.println("**************Printing List of Product using While Loop*************");
         int c =0;
         while(c<count){
             int id = v.get(c).productID;
             String name = v.get(c).productName;
             int cost = v.get(c).productCost;
             System.out.println(id+" "+name+" "+cost);
             c++;
         }
                
            
       System.out.println("*********Printing List of Products Using enumeration*********");
       Enumeration<Product>p = v.elements();
       while(p.hasMoreElements()){
           Product pp = p.nextElement();
           System.out.println(pp.productID+" "+pp.productName+" "+pp.productCost);
       }

    }

}
