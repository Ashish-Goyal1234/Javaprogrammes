package vectorClass;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rep = "";
        System.out.println("Enter Strig to replacewords :");
        String s = sc.nextLine();
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLetter(c)!=false){
                rep = "*";
            }
        }
        System.out.println(rep);
        
    }
}
