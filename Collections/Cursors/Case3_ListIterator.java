package Cursors;

import java.util.ArrayList;
import java.util.ListIterator;
/*
 * Always cursors are present before first record
 */
public class Case3_ListIterator {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Value List 1");
        al.add("Value List 2");
        al.add("Value List 3");
        al.add("Value List 4");
        
        
        //List Iterator Cursor : with normal version : print the data Forward direction
        ListIterator lt = al.listIterator();
        while(lt.hasNext()){
           String s = (String) lt.next();
           System.out.println(s);
        }
        System.out.println("\n");
      //List Iterator Cursor : with normal version : print the data backward direction
        while(lt.hasPrevious()){
            String s = (String) lt.previous();
            System.out.println(s);
         }
        
        System.out.println("List Iterator By Using generic....!");
      //List Iterator Cursor : with normal version : print the data Forward and Backward direction
        ListIterator<String> lt1 = al.listIterator();
        while(lt1.hasNext()){
           String s = lt1.next();
           System.out.println(s);
        }
        System.out.println("\n");
        while(lt1.hasPrevious()){
            String s = lt1.previous();
            System.out.println(s);
         }
        
        
        
        
    }

}
