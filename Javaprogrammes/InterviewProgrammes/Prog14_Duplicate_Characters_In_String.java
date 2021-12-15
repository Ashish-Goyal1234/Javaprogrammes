package InterviewProgrammes;


public class Prog14_Duplicate_Characters_In_String {

    public static void main(String[] args) {
          String s = "beautiful beach";
          char ch[] = s.toCharArray();
          for(int i=0;i< ch.length;i++){
             for(int j=i+1;j<ch.length;j++){
                 if(ch[i] == ch[j]){
                     System.out.println("Duplicate words in String : " + ch[i] + " ");
                 }
             }
          }
    }

}
