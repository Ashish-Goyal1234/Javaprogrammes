package InterviewProgrammes;

import java.util.Arrays;

public class Prog18_ReplaceWords {

    /*
     *  Expected output : "*'*  *  *8*  2*?"
     */
    public static void main(String[] args) {
        String s = "Let's meet l8r 2nite?";
        String replace = "";
        String str[] = s.split(" ");
        for(int i = 0; i < str.length; i++){
            if(Character.isLetter(str[i].charAt(i))){
               replace =   s.replaceAll("[a-zA-Z]", "*");
            }
        }
        System.out.println(replace);

    }

}
