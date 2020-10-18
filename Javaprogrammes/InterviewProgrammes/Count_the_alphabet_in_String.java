
package InterviewProgrammes;

public class Count_the_alphabet_in_String {

    public static void main(String[] args) {
        /*
         * Usecase count the 'd' alphabet in given string and print in java.
         */

        
        String s = "beautiful beach";
        int count = 0;
        String first = null;
        String second = null;
        int length = s.length();
        for(int i = 0;i<length;i++){
         first = Character.toString(s.charAt(i));
             for(int j=i+1;j<length;j++){
                 second = Character.toString(s.charAt(j));
                     if(first.equals(second)){
                            
                         System.out.println(second);
                        }
             }
        }
      
    }
}

