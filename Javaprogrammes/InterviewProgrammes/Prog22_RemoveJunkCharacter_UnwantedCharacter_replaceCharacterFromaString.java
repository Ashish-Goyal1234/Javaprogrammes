package InterviewProgrammes;


public class Prog22_RemoveJunkCharacter_UnwantedCharacter_replaceCharacterFromaString {

    public static void main(String[] args) {
        String s = "!@##$% Ashish !@#$%^&*()_ characters123456";
       
        // ^ : stands for Except a-zA-z0-9 remove all /replace.
       String s1 =  s.replaceAll("[^a-zA-Z0-9]", " ");
       System.out.println(s1);
    }

}
