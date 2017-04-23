package com.Testing;

public class ClassC {
	
	int price;
	String ProductName;
	
	
	public ClassC(int price, String productName) {
		super();
		this.price = price;
		ProductName = productName;
	}
	
	//instance block 
	
	{
		
		System.out.println("this is block code -1");
	}
	//instance block 
    {
		
		System.out.println("this is block code-2");
	}
    
    //static block 
    
    static
    {
    	
    	System.out.println("this is static block code-1");
    }
	

public void add(){
	
	System.out.println("this is ADD");
}
	
	


}
