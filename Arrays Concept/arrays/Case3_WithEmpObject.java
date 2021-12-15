package arrays;


public class Case3_WithEmpObject {

    public static void main(String[] args) {
            
        Emp e1 = new Emp(111, "Ratan");
        Emp e2 = new Emp(222, "Anu");
        Emp e3 = new Emp(333, "Durga");
        Emp e4 = new Emp(444, "sravya");
        
        Emp[] e = new Emp[4];
        e[0] = e1;
        e[1] = e2;
        e[2] = e3;
        e[3] = e4;
        
        for(Emp ee : e){
            System.out.println(ee.eid +" "+ ee.ename);
        }
    }

}
