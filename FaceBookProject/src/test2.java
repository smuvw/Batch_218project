
public class test2 {
	
	static String city;
	int i;
	
	//public - Modifier 
	//static - keyword this optional
	//void - return type 
	//add - method name 
	
	public int add1(int a,int b){
		
		int c=a+b;
		return c;
		
	}
	
	public String display(){
		
		return "Sri";
	}
	
	public boolean display1(){
		
		return true;
	}
	
	public static void add(int a,int b){
		int c=a+b;
		System.out.println(c);
	}
	
	public static void sub(){
		
		System.out.println("this is sub method");
	}
	
	
	
	
	
	public void mul(int a,int b){
		
		int c=a*b;
		System.out.println(c);
		
		
	}
	

	

	public static void main(String[] args) {
		test2.add(1, 2);
		test2.add(10, 20);
		test2.add(5, 5);
		test2.sub();
		
		test2 t2= new test2();
		
		t2.mul(4, 5);
	
		
		
		
	/*	int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c)*/;
		

	}

}
