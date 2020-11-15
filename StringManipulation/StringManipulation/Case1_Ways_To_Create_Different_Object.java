package StringManipulation;

public class Case1_Ways_To_Create_Different_Object {
    /*
   Two ways to create object in String 
       1. Without using new Keyword : which stores data in "String Constant Memory" and it always check before creating new object wheneter already any object present having same value.
       2. With using new Keyword     : In entire Java new creates a new Object.
       3. Only String class internally overrides ".equals" method and perform content comparison. StringBuffer does not override equals().
    */
	public static void main(String[] args) {

	    // By Durga
	  //  String s = new String();   // Empty String obj
	    // String s = new String("String literals");
	//    String s1 = new String(StringBuffer sb);
        //    String s2 = new String(StringBuilder sb);
	 //   String s3 = new string(char[] ch);
	 //   String s4 = new String(byte[] b);
	    
	    
	    String s1 = "Ashish";
	    System.out.println(s1);
	    
	    String s2 = new String("Ashish");
	    System.out.println(s2);

	       char[] ch = {'a', 'b','c','d','e'};
	       String s3 = new String(ch);
	       System.out.println(s3);
	       
	       String s4 = new String(ch,1, 3);  //Op will be 'b', 'c', 'd' becaue we have given start index 1 upto 3 chars.
	       System.out.println(s4);
	       
	       byte [] b = {65,66,67,68,69,70};
	      String s5 = new String(b);  // Values are converted into Unicode values.
	       System.out.println(s5);
	       
	       String s6 = new String(b, 3, 3); //Op will be 'D', 'E', 'F' becaue we have given start index 3 upto 3 chars.
	       System.out.println(s6); // byte values are converted into unicode values.
	}
}
