package OOPS;

public class test3 extends test2{

	public void m4(){
		System.out.println("this is M4 method");
	}
	
	public void m3(){
		System.out.println("this is M3 method from test3");
	}
	
	//method overloading 
	public void m3(int a){
		System.out.println("this is M3 method from test3 " + a);
	}
	
	public static void main(String[] args) {
		
		
		test3 t3= new test3();
		t3.m1();
		t3.m2();
		t3.m3();
		t3.m3(20);
		t3.m4();
		

	}

}
