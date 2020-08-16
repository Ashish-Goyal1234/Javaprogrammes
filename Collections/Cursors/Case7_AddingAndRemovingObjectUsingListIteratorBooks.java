package Cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class Case7_AddingAndRemovingObjectUsingListIteratorBooks {

    public static void main(String[] args) {
        ArrayList<Books> al = new ArrayList<Books>();
        al.add(new Books(111, "Java", "Author 1"));
        al.add(new Books(222, "CPP", "Author 2"));
        al.add(new Books(333, "Linux", "Author 3"));
        al.add(new Books(444, "Springs", "Author 4"));
        
        ListIterator<Books> lst =al.listIterator();
       lst.add(new Books(555, "Selenium", "Author 5"));
       lst.add(new Books(666, "QTP","Author 6"));
       while(lst.hasNext()){
          Books b = lst.next();
          if(b.bookId==333){
              lst.remove();
          }
          if(b.bookName=="QTP"){
              lst.set(new Books(777, "Postman", "Author 7"));
          }
       }
       
       for(Books b : al) {
           System.out.println("Book Id : "+ b.bookId + "\nBook name : "+ b.bookName+ "\nBook Author : " + b.author);
       }
       
    }

}
