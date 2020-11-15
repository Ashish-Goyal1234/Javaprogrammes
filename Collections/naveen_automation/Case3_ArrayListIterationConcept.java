package naveen_automation;

import java.util.ArrayList;
import java.util.Iterator;

public class Case3_ArrayListIterationConcept {

    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<String>();
        studentList.add("Tom");
        studentList.add("Naveen");
        studentList.add("Steave");
        studentList.add("Lisa");
        
        // 1. Typical for Loop
        for(int i=0;i<studentList.size();i++){
            System.out.println(studentList.get(i));
        }
        System.out.println("*****************for Each Loop**************");
        //2. for Each loop
        for(String s : studentList){
            System.out.println(s);
        }
        System.out.println("*****************Lamda Function**************");
        studentList.stream().forEach(ele -> System.out.println(ele));
        System.out.println("*****************Iterator**************");
        Iterator<String> it = studentList.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        
        
        
    }

}
