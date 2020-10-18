package arrays;


public class Case5_FindIndexOfNullLocations {

    public static void main(String[] args) {
            
        Emp e1 = new Emp(11,"ratan");
        Emp e2 = new Emp(222,"anu");
        Emp e3 = new Emp(333, "durga");
        
        Emp e[] = new Emp[5];
        
        e[0] = e1;
        e[2] = e2;
        e[4] = e3;
        
        for(int i = 0;i<e.length;i++){
            if(e[i]==null){
                System.out.println(i);
            }
        }
    }

}
