package AbstractClasses;

abstract public class bank {
	abstract int roi();

	public static void main(String[] args){
		axisbank a = new axisbank();
		System.out.println(a.roi());
		
		sbibank s= new sbibank();
		System.out.println(s.roi());
	}
}


class axisbank extends bank {
	int roi(){
		return 9;
	}
}

class sbibank extends bank{
	
	int roi(){
		return 10;
	}
}
