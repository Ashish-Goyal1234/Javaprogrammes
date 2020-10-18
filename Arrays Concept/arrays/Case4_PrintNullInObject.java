package arrays;


public class Case4_PrintNullInObject {

    public static void main(String[] args) {
        
   Emp e1 = new Emp(111,"ratan");
   Emp e2 = new Emp(222,"anu");
   Emp e3 = new Emp(333, "durga");
        // Below we will face null pointer exception for e[1] and e[3] as data is not inserted in that locations so to overcome use object class and if condition
        Emp e[] = new Emp[5];
        e[0] = e1;      
        e[2] = e2;
        e[4] = e3;
       
        for(Object o : e){
            if(o instanceof Emp){
              Emp k = (Emp)o;
              System.out.println(k.eid+" "+k.ename);
            }
            
            if(o==null){
                System.out.println(o);
            }
        }
    }

}
