package OOPS;

public class test2 extends test1{
	
	public void m3(){
		System.out.println("this is M3 method- from test2");
	}


	public static void main(String[] args) {
	
		test2 t2= new test2();
		
		t2.m1();
		t2.m2();
		t2.m3();
		
	}

}
