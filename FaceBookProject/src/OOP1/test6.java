package OOP1;
//Singleton Pattern design 
public class test6 {

	public static void main(String[] args) {
		
		test5 t6=test5.getinstance();
		System.out.println(t6);
		
		t6.empdetails("sri", 1);
		
		test5 t7=test5.getinstance();
		System.out.println(t7);
		
		t7.empdetails("Swapna", 2);

	}

}
