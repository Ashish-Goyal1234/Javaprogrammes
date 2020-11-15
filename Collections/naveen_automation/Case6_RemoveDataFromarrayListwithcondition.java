package naveen_automation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Case6_RemoveDataFromarrayListwithcondition {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>(Arrays.asList("Naveen", "Tom", "Naveen", "Steve", "Lisa", "Naveen"));
        int index = al.lastIndexOf("Naveen");
        System.out.println(index);
        
        al.remove(1);
        System.out.println(al);
        al.remove("Lisa");
        System.out.println(al);
        
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        numbers.removeIf(num -> num%2==0);    // Used to print all odd numbers
      System.out.println(numbers);
        
      // Remove Duplicate Elemnets From ArrayList by using LinkedHashSet
      ArrayList<Integer> duplicateElements = new ArrayList<Integer>(Arrays.asList(1,2,2,1,3,4,5,6,1,8,9,2,3,5,10,1,4,5));
      
      LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>(duplicateElements);
      ArrayList<Integer> numberWithoutDuplicates = new ArrayList<Integer>(lh);
      System.out.println(numberWithoutDuplicates);
      
        //2. By Using Streams:
        
      ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,2,2,1,3,4,5,6,1,8,9,2,3,5,10,1,4,5));
     List<Integer> marksListUnique =  marksList.stream().distinct().collect(Collectors.toList());
     System.out.println(marksListUnique);

      
      
        }
}
