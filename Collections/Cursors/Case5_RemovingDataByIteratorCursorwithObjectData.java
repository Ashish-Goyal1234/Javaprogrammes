package Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class Case5_RemovingDataByIteratorCursorwithObjectData {
    public static void main(String[] args) {
        
        ArrayList<Books> al = new ArrayList<Books>();
        al.add(new Books(1001, "Book 1", "Author 1"));
        al.add(new Books(1002,"Book 2","Author 2"));
        al.add(new Books(1003,"Book 3","Author3"));
        al.add(new Books(1004,"Book 4","Author 4"));
        
        Iterator<Books>  book = al.iterator();
        while(book.hasNext()) { 
            Books b = book.next();
            if(b.bookId==1001){
                book.remove();
            }
        }
        // Printing remaining data
        for(Books b : al)
        System.out.println("Book id : " + b.bookId + "\n Bookname : " + b.bookName + "\n Book Author : " + b.author) ;
    }

}
