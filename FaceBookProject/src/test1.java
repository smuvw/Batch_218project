
public class test1 {
	
	
	//instance variables 
	
	int i;
	String City;
	
	
	//static variable
	
	static String state;
	
	
	//add method with instance 
	public void add(){
		int b=30; //local variable
		System.out.println(b);
		System.out.println(i);
		System.out.println(City);
		test1.state="NJ";
	}
	
	
  //main method 
	public static void main(String[] args) {
		
		
		test1.state="IL";
		
		test1 t1=new test1();
		t1.i=40;
		t1.City="CHICAGO";
		
		int a=10;  //local variable
		String name="sri"; //local variable
		System.out.println(a);
		t1.add();

	}

}


