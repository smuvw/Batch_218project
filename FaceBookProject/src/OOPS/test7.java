package OOPS;

public class test7 implements test6{
	
	public static void main(String[] args) {
		test7 t7= new test7();
		t7.m20();
		t7.m21();
		t7.m22();
		System.out.println(t7.price);
		System.out.println(t7.city);
	}

	@Override
	public void m20() {
		System.out.println("this is m20");
		
	}

	@Override
	public void m21() {
		System.out.println("this is m21");
		
	}

	@Override
	public void m22() {
		System.out.println("this is m22");
		
	}

}
