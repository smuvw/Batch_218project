package OOP1;

public class test1 implements test2{

	@Override
	public void m1() {
		System.out.println("this is Open URL");
		
	}

	@Override
	public void m2() {
		System.out.println("this is Login");
	}

	
	public static void main(String[] args) {
		
		test1 t1= new test1();
		t1.m1();
		t1.m2();
		
	}
}
