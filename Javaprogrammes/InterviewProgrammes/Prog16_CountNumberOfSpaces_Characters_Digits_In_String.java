
package InterviewProgrammes;

public class Prog16_CountNumberOfSpaces_Characters_Digits_In_String {
 static int spaceCount = 0;
 static int charCount = 0;
 static int digitCount = 0;
    public static void main(String[] args) {
        String s = "Ashish Test 123 Ashish Test";
        int length = s.length();
        s.toLowerCase();
        
        for(int i = 0; i < length ;i++){
            if(Character.isSpaceChar(s.charAt(i))){
                spaceCount++;
            }else if(Character.isLetter(s.charAt(i))){
                charCount++;
            }else if(Character.isDigit(s.charAt(i))) {
                digitCount++;
            }
        }
        System.out.println("Total Space :" + spaceCount);
        System.out.println("Total charcters :" + charCount);
        System.out.println("Total Digits :"+ digitCount);
    }
}

