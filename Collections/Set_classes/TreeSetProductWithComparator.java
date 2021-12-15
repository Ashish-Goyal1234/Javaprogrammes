package Set_classes;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetProductWithComparator {

    public static void main(String[] args) {
        
        // Example 1 : Get Values Using For each loop and Product name comparision.
                    
                        TreeSet<Product> p = new TreeSet<Product>(new MyComparatorProductname());
                        p.add(new Product(2002, "Chair", 1000));
                        p.add(new Product(2006, "Pen", 100));
                        p.add(new Product(2001, "Book", 85));
                        p.add(new Product(2004, "TV", 50000));
                        
                        //Using for Each Loop:
                        /*Below if we do not implement comparator then we will face error Class Cast exception.
                         * Because Tresset set must stored in comparable data but Product is not comparable
                         * SO To resolve the issue sort according to my comparator data
                         */
                       for(Product p1 : p){
                           System.out.println(p1.productId + " "+ p1.productName+ " "+ p1.productCost);
                       }
    System.out.println("********************Output with Product ID******************");
    // Example 2 : Get Values Using Iterator and Product Id comparision.
    /*
     *   1.  In below example for comparing ProductId i have compare the ID by using >,==,< because productId is of int type.
     *   2. In previous example "TreeSetProvidingOwnComparator", I am comparing Interger Type(object Type) with compareTo() because the data is in
     *       Interger type so no issues to use compareTo().
     */ 
                       
                       TreeSet<Product> p1 = new TreeSet<Product>(new MyComparatorProductnamewithProductID());
                       p1.add(new Product(2008, "Chair", 1000));
                       p1.add(new Product(2003, "Pen", 100));
                       p1.add(new Product(2001, "Book", 85));
                       p1.add(new Product(2004, "TV", 50000));
                       
                              Iterator<Product> itr = p1.iterator();
                              while(itr.hasNext()){
                            Product listProducts =      itr.next();
                            System.out.println(listProducts.productId+ " " + listProducts.productCost + " " + listProducts.productName);
                              }
    }
}


class MyComparatorProductname implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p1.productName.compareTo(p2.productName);
    } 
}

class MyComparatorProductnamewithProductID implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        if(p1.productId==p2.productId){
            return 0;
        }else if(p1.productId > p2.productId){
            return 1;
        }else
        return -1;
    }
    } 
