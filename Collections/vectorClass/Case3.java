package vectorClass;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Case3 {

    public static void main(String[] args) {
        Vector<Product> products = new Vector<Product>();
        products.add(new Product(1001, "p1", 10));
        products.add(new Product(1001, "p2", 20));
        products.add(new Product(1001, "p3", 30));
        products.add(new Product(1001, "p4", 40));
        
        // 1. Reading the data by using Iterator
        System.out.println("**********Printing Elements by Using Iterator concept***********");
        Iterator<Product> it = products.iterator();
        while(it.hasNext()){
              Product p = it.next();
              System.out.println(" Product id : " +  p.product_id +", Product Name : "+ p.product_Name +", Product Cost  :" + p.product_Cost);
              }
        
        // 2. Reading the data by using ListIterator
        System.out.println("\n**********Printing Elements by Using ListIterator concept***********");
        ListIterator<Product> lt= products.listIterator();
        while(lt.hasNext()){
            Product p1 = lt.next();
            System.out.println("Product name : " + p1.product_Name+ ", Product id: " + p1.product_id+ ", Product_Cost : " + p1.product_Cost);
        }
        
        //3. Reading the data by using Enumerator
        System.out.println("\n**********Printing Elements by Using Enumerator concept***********");
          Enumeration<Product> en = products.elements();
        while(en.hasMoreElements()){
                Product p2 = en.nextElement();
                System.out.println("Product name : " + p2.product_Name+ ", Product id: " + p2.product_id+ ", Product_Cost : " + p2.product_Cost);
        }
    }
     
    }
