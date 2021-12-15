package InterviewProgrammes;

import java.util.Scanner;

public class Prog19_CountVowelsInString {

    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        for(int i =0 ; i< str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
