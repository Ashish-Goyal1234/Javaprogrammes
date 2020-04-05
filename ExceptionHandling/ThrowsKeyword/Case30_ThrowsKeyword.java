package ThrowsKeyword;

// Throws keyword is used for just deletion purpose to its caller method

public class Case30_ThrowsKeyword {
 
    void StudentDetails() throws InterruptedException{   // This method now throws exception to handle 
                                                                                      //   to caller method i.e "HOD" method
    System.out.println("Student is sleeping");
    Thread.sleep(10000);
    }
    
    void hod() throws InterruptedException{    // Exception raised in StudentDetails came here and now moved to Caller metod i.e "Principle" method.
        StudentDetails();
    }
    void principle() {
        try{
        hod();
        }catch(Exception e){
            e.printStackTrace();   // Now the Exception is handled by principle
        }
    }
    
     void officeBoy() {
         principle();
    }
    public static void main(String[] args) {
        Case30_ThrowsKeyword t = new Case30_ThrowsKeyword(); 
        t.officeBoy();
    }

    

}
