package LinkedList;

import java.util.LinkedList;


public class Case1 {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Test 1");
        ll.add("Test 2");
        ll.add("Test 3");
        ll.add("Test 4");
        
        System.out.println(ll);
        ll.addFirst("aaa");
        ll.addLast("bbb");
        System.out.println(ll);
        System.out.println(ll.size());
        
        ll.set(2, "Replaced value");
        System.out.println(ll);
        
        ll.remove(1);
        ll.remove("Test 3");
        ll.removeFirst();
        ll.removeLast();
        
        System.out.println(ll);
        System.out.println(ll.isEmpty());
        ll.clear();
        System.out.println(ll.isEmpty());
    }

}
