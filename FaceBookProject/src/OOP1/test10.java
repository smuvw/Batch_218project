package OOP1;

public class test10 {
	
	static int value1=2;
	
	static void display(){
		
		value1=value1-- - --value1;
		System.out.println(value1);
		//value1=value1++ + ++value1;
		//System.out.println(value1);
	}

	public static void main(String[] args) {
		display();

	}

}
