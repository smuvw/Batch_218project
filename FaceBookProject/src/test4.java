
public class test4 {
	
	int i;
	String name;
	//display and instance method 
	public void display(){
		System.out.println("this is display");
		
		add(2,3); //Calling method within method 
	}
	
	//add and instance method 
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	
	public static void sub(){
		
		test4 t= new test4();
		t.display();
		
	}

	
	//Main to execute java prog
	
	public static void main(String[] args) {
		
		
		//object created for test4 class
		  /*test4 t4=new test4();
		  t4.display();
		  t4.name="sri";
		  System.out.println( t4.name);
		  */
		  test4.sub();
		

	}

}
