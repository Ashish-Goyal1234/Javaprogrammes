package MethodsInCollectionListAndSet;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMethodsList {

    public static void main(String[] args) {
       LinkedList<Product> ll = new LinkedList<Product>();
       ll.add(new Product(10, "Table", 1000));
       ll.add(new Product(5, "Pen", 10));
       ll.add(new Product(5,"Pen",20));
       ll.add(new Product(15, "Chair", 1500));
       ll.add(new Product(3, "Book", 100));
       Product ob = new Product(11, "paper",20);
       ll.add(ob);
       
       LinkedList<Product> ll1 = new LinkedList<Product>();
       ll1.add(new Product(110, "TV", 50000));
       ll1.add(new Product(120, "Fridge", 20000));
       ll1.add(new Product(90, "Gyser", 10000));
       ll1.add(new Product(150, "Washingmachine", 15000));
       
       
       ll.addAll(ll1);
       ll.add(3, new Product(13,"Slate", 35));
       System.out.println(ll.contains(ob));
       System.out.println(ll.containsAll(ll1));
       System.out.println(ll.indexOf(ob));
       ll.remove(2);   // Remove 2nd index value
       System.out.println(ll.isEmpty());
       ll.addFirst(new Product(1,"FirstProduct",100));
       ll.addLast(new Product(33, "Last Product", 350));
       System.out.println(ll.getFirst());
       
       
       System.out.println("***********Printing LinkedLIst Product using for Each Loop**************");
       for(Product p : ll){
           System.out.println(p.productID+" "+p.productName+" "+p.productCost);
       }
       
       System.out.println("*****************Printng ListIterator in Descending order using DescendentIteator***********");
           Iterator<Product> p = ll.descendingIterator();
           while(p.hasNext()){
              Product p1 =  p.next();
              System.out.println(p1.productID+" "+p1.productName+" "+p1.productCost);
           }
           
        System.out.println("***********Printing Data Using List Iterator****************");
        
          ListIterator<Product> li =   ll.listIterator();
          while(li.hasNext()){
              Product pp = li.next();
              System.out.println(pp.productID+" "+pp.productName+" "+pp.productCost);
          }
    }

}
