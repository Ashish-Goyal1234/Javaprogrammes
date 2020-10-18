package collectionSorting;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Case4_Products {

    public static void main(String[] args) {
        LinkedList<Product> electronic = new LinkedList<Product>();
        electronic.add(new Product(1006, "Refrigerator", 12000f));
        electronic.add(new Product(1001, "TV", 3000f));
        electronic.add(new Product(1005, "Washing Machine", 18000f));
        electronic.add(new Product(1002, "Mixer", 2000f));
        
        Collections.sort(electronic, new ProductIdComparator());
        for(Product p :electronic) {
            System.out.println(p.productId + " " +p.productName + " " + p.productCost);
        }
       
  System.out.println("---------------Printing the data by Using ListIterator---------------");
       int size = electronic.size(); 
      ListIterator <Product> p =electronic.listIterator();
      for(int i=0;i<=size;i++){
          while(p.hasNext()){
              Product p1 = (Product) p.next();
              System.out.println(p1.productId + " " +p1.productName+ " "+ p1.productCost);
          } 
       }
      
       }
    }
