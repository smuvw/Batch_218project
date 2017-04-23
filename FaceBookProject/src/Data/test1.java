package Data;

public class test1 {

	public static void main(String[] args) {
		
		//Array
		
		int[] a= new int[4];
		a[0]=10;
		a[1]=12;
		a[2]=13;
		a[3]=14;
		//a[4]=15;
				
		System.out.println(a[0]);	
		System.out.println(a[1]);	
		System.out.println(a[2]);	
		System.out.println(a[3]);	
		//System.out.println(a[4]);
		//String[]  b= new String[3];
		
		String[]  b= {"srini","vamsi","sam"};
		System.out.println(b[0]);	
		System.out.println(b[1]);	
		System.out.println(b[2]);	
		
		
		Object[] c= new Object[3];
		c[0]=10;
		c[1]="Srini";
		c[2]=10.25;
		
		System.out.println(c[0]);	
		System.out.println(c[1]);	
		System.out.println(c[2]);	
		
	}

}
