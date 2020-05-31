package StringManipulation;

public class Case5_Ex2_Emp {

    int eid;
    String ename;
    
    public Case5_Ex2_Emp(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "Emp ID : "+ eid + "Emp Name" + ename ;
    }

    public static void main(String[] args) {
        Case5_Ex2_Emp e1  = new Case5_Ex2_Emp(111,"Ashish");
        System.out.println(e1);
        System.out.println(e1.toString());
    }

    
}
