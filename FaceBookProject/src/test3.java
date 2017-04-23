
public class test3 {

	public static void main(String[] args) {
		
		test2.add(5, 5);
		test2.sub();
		test2.city="HYD";
		
		test2 t2= new test2();
		t2.mul(6, 5);
		t2.i=10;
		
		int j=t2.add1(5, 7);
		System.out.println(j);
		
		String k=t2.display();
		System.out.println(k);
	}

}
