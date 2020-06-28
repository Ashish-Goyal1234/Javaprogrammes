package StringManipulation;


public class Case3_Mutable_Vs_immutable {

    public static void main(String[] args) {
        //String is  Immutable so Modifications are not allowed for object created,
        String s ="Ashish";
                s.concat("soft");
                System.out.println(s);  //O/p will be "Ashish"
                
         //String is mutable so modifications are allowed for objects created.      
         StringBuffer buffer = new StringBuffer("durga");
         buffer.append("soft");
         System.out.println(buffer); //O/p will be durgasoft
    
         //concat() used to combine the two objects ane returns new object.
         String s1 ="Ashish";
         String newObje = s1.concat("soft"); //s1 object is removed and pointed to new object.
         System.out.println(newObje); //o/p will be Ashishsoft
         
         //interview question
         String s2 = "Ashish";
         s2 = s2.concat("soft"); // object is created internally for s2
         System.out.println(s2);  //O/p will be Ashishsoft beacuse above new object is creating internally/
         
         String k = "Ashish Goyal";
         k = "Ashish";
         System.out.println(k); // o/p will be Ashish
                 
         
    }

}
