/*
         The overriden method(parent method) does not throws any exception, 
             the overriding method(child method) can throws unchecked exception but not checked Exception.
 */
package ExceptionHandlingOverridingRules;

class parent{
      void marraige(){                         //overriden method
          
      }
    }
    
    
    class child extends parent{
        void marraige() throws ArithmeticException{  // overriding method.
            
        }
        
/*        void marriage() throws InterruptedException{
            Thread.sleep(1000);
        }*/
        
    }

public class Case1 {
    public static void main(String[] args) {

    }

}
