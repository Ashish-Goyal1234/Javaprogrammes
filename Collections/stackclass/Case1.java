package stackclass;

import java.util.Stack;

public class Case1 {

    public static void main(String[] args) {
        
        Stack <String> s = new Stack<String>();
        s.push("String 1");
        s.push("String 2");
        s.push("String 3");
        s.push("String 4");
       // s.add("String 5"); // This is also supported as add method is from collection Interface.
        System.out.println(s);
        System.out.println(s.search("String 2"));   // Stack uses Last In First Out (LIFO)
        System.out.println(s.pop());  // USe to remove the data.
        System.out.println(s);
        System.out.println(s.peek()); // return top element of stack.
        System.out.println(s.empty());
        s.clear();
        System.out.println(s.empty());
        

    }

}
