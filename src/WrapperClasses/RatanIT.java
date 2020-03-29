package WrapperClasses;

public class RatanIT {
    public static void main(String[] args) { //whatever arguments passing from command line are stored in string[]
        
        
 //1. Conversion from primitive or string to --------> Wrapper Object.
        //Approch 1   by using constructor.
        Integer i1 = new Integer(10);      
        Integer i2 = new Integer("20");
        System.out.println(i1+i2);
        
        //approch 2 By using value()
        
        Integer x1 = Integer.valueOf(10);
        Integer x2 = Integer.valueOf("20");
        System.out.println(x1+x2);

// 2. Conversion Wrapper object -----> String or primitive.
   
        // wrapper object to ---> primitive data
        
        Integer i = Integer.valueOf(100);
        Integer j = Integer.valueOf(100);
        
        int x =i.intValue();
       double d =i.doubleValue(); 
       System.out.println(x+d);
       
       //Wrapper object -----> String
       
       String j1 =j.toString();
       System.out.println(i+j1);
       
    // 3. Conversion of String to primitive or primitive to string.
       
       // convert primitive to string.
       int a=10; int b=20;
       
       String s1 = String.valueOf(a);
       String s2 = String.valueOf(b);
    System.out.println(s1+s2);
    
    
    //String to primitive conversion.
    
    String str1 = "10";
   String str2 = "20"; 
    
    int a1 = Integer.parseInt(str1);
    float f = Float.parseFloat(str2);
    System.out.println(a1+f);
    
    
    
    //Adding value in command line argumant and running the programme.
    // To eneter values in command line arguments Right click on project  -> Run As -> Run configuration -> Arguments
    System.out.println(args.length);
    System.out.println(args[0]);
    System.out.println(args[1]);
System.out.println(args[0]+args[1]);  // we will not get output in addition we will get output as concatenation as value is stored on string[] above.
    
int a2 =Integer.parseInt(args[0]);
float f2 =Float.parseFloat(args[1]);
    System.out.println(a2+f2);
   
    Integer l = Integer.valueOf("100");   // valid
    Integer l = "100";   //Error : cannot convert from string to integer 
    Integer p = Integer::valueOf("100");
    
    }
    
    
    
    
}
