package InterviewProgrammes;


public class RemoveDuplicatesFromString {

    public static void main(String[] args) {
                String s= "this string contains two two";
                String first = null;
                String second = null;
                int length = s.length();
                for(int i=0;i<length;i++){
                    first = Character.toString(s.charAt(i));
                    for(int j = i+1;j<length;j++){
                        second = Character.toString(s.charAt(j));
                        if(first.equals(second)){
                            
                        }
                    }
                }
                
    }

}
