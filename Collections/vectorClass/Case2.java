package vectorClass;

import java.util.Iterator;
import java.util.Vector;
import SynchronizedAndNonSynchronized.Synchronized;

public class Case2 {

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        for(int i=1;i<=30;i++){
            v.add(i);
        }
        System.out.println(v);
        System.out.println("Caapcity of vector :" + v.capacity());
        
      Iterator<Integer> it =  v.iterator();
  while(it.hasNext()){
      Integer i = it.next();
      if(i%2==0){
          System.out.println(i);
      }
      else{
          it.remove();
      }
  }
  System.out.println("Printing only even values :"+ v);
 
    }

}
