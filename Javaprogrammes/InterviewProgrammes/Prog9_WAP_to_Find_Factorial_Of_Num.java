package InterviewProgrammes;

import java.util.HashMap;

public class Prog9_WAP_to_Find_Factorial_Of_Num {

    private static HashMap<String, String> getCredentials() {
        HashMap<String, String> credentials = new HashMap<String, String>();
        credentials.put("Customers", "Ashish : Test@123");
        credentials.put("admin", "admin : pass@123");
        return credentials;
    }
   
    public static void main(String[] args) {
          String details  = getCredentials().get("Customers");
          System.out.println(details.split(":")[0]);
          System.out.println(details.split(":")[1]);
        }
}