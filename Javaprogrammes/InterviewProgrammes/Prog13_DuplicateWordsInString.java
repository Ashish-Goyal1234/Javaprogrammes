package InterviewProgrammes;

import java.util.Arrays;

public class Prog13_DuplicateWordsInString {

   static int count;
    public static void main(String[] args) {
      
        String str = "Java is the best Java language is a Java";
        // 1. Splitting and coverting the string into arrays.
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));  // Used to print array values.
        
        // 1. By using 2 for loops.
        for(int i = 0 ; i < words.length ; i++){
            count = 1;
            for(int j = i+1; j < words.length ; j++){
                if(words[i].equals(words[j])){
                    count ++;
                   words[j] = "0";    //Set words[j] to 0 to avoid printing visited word    
                }
            }
            if(count > 1 && words[i] != "0" ){    //Displays the duplicate word if count is greater than 1
                System.out.println("Duplicate words in a String : "+ words[i]);
            }
        }
    }
}
