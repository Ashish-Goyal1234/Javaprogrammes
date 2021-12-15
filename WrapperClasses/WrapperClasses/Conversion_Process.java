package WrapperClasses;


public class Conversion_Process {

    public static void main(String[] args) {
            
   // Converting Primitive or String to Wrapper object 
       Integer i = new Integer(10);
       System.out.println("Converting primitive to wrpper object :" + i);
       
       Integer i1 = new Integer("10");
       System.out.println("coverting string to wrapper object :" + i1);
       
       Character c = new Character('a');
       System.out.println("Converting character to wrapper object :" + c);
       
       Float f = new Float(10.5f);
       System.out.println("Converting float to wrapper object " + f );
       
       Double d = new Double(25.5);
       System.out.println("Converting double to wrapper object :" + d);
       
       Float f1 = new Float("13.5f");
       System.out.println("Converting String to wrapper object :" + f1);
       
    }

}
