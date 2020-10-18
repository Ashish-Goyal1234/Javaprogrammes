package arrays;


public class Case8_StoreHetrogeneoudDatabyhelpofObjectClass {

    public static void main(String[] args) {
        Object o[] = new Object[3];
        o[0] = new Emp(111,"ratan");
        o[1] = new Student(1, "aaa");
        o[2] = new Integer(10);
        
        for(Object oo : o){
            if(oo instanceof Emp){
                  Emp e = (Emp)oo;
                  System.out.println(e.eid + " "+e.ename );
            }
            if(oo instanceof Student){
                Student s = (Student)oo;
                System.out.println(s.studid + " "+ s.studName );
            }
            
            if(oo instanceof Integer) {
                Integer i = (Integer)oo;
                System.out.println(i);
            }
        }
        
    }

}
