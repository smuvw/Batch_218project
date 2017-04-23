package OOP1;

public class test5 {

	// 1.Create Constructor with private 
	private test5() {
	
	}
	
	//2.Create test5 object
	
	 private static test5 instance=new test5();
	 
	 //create method to give the access to public 
	 
	 public static test5 getinstance(){
		 return instance;
	 }

	 
	 public void empdetails(String EMPName,int EMPID){
		 System.out.println(EMPName+EMPID);
		 
	 }
}
