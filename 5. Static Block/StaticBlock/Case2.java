package StaticBlock;

public class Case2 {

   static {
        System.out.println("Static Block-1");
    }
   static{
       System.out.println("Static block 2");
   }
       
/*   Upto 1.5 version without main method static blocks are executed, after 1.5 version in order to 
    execute static blocks also main method required.*/
}
