
package InterviewProgrammes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Prog15_Find_DuplicateElementsInArray {

    static int count;
    public static void main(String[] args) {
            String names[] = {"Java", "JavaScript", "Java" , "Ruby", "C" , "Python" , "Java", "C"};
            
            // 1. Compare Each Element  : Time complexity is O(n*n)  --  worst Solution because lets say in future we are having 1000 elements then it will compare each and every element.
            for(int i = 0 ; i < names.length ; i++){
                count = 1;
                for(int j = i+1; j < names.length ; j++){
                    if(names[i].equals(names[j])){
                      count ++;
                      names[j] = "0"; //Set words[j] to 0 to avoid printing visited word
                    }
                }
                if(count > 1 && names[i] !="0"){
                    System.out.println("Duplicate Elements in Array :" + names[i]);
                }
            }
            
            // 2. Using HashSet : Java Collection : It stores Unique Values.
            // Time complexity : O(n) -- good solution
 System.out.println("*******************");           
            Set<String> store = new HashSet<String>();
            for(String progLanguage : names){
                if(store.add(progLanguage) == false){
                    System.out.println("Duplicate Elements  : " +  progLanguage);
                }
            }
            
            System.out.println("***************");
            // 3. By Using HashMap. (This was Little difficult)
            Map<String, Integer> storeMap = new HashMap<String, Integer>();
                    
            }

}
 