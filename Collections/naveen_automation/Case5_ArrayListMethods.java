package naveen_automation;

import java.util.ArrayList;

public class Case5_ArrayListMethods {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Java");
        al.add("Python");
        al.add("Ruby");
        al.add("Javascript");
        
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("Selenium");
        al1.add("QTP");
        al1.add("Karate");
       
      //  al1.addAll(al);
        
        al1.addAll(2, al);
        
        System.out.println(al1);
        
       ArrayList<String> cloneList =  (ArrayList<String>) al1.clone();
       System.out.println("CloneList : " + cloneList);
       
       System.out.println(al.contains("Python"));
       
       System.out.println(al.indexOf("Ruby"));
       System.out.println(al.indexOf("Ruby")>0);
    }

}
