package OOP1;

public class test4 {

	public static void main(String[] args) {
		test3 t3= new test3(10,"Srini");
		
		System.out.println(t3);
		
		//t3.setEid(100);
		//t3.setEname("srini");
		
		System.out.println(t3.getEid());
		
		System.out.println(t3.getEname());
		test3 t4= new test3(10,"Srini");
		System.out.println(t4);
	}

}
