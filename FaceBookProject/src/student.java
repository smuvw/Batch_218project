
public class student {

	public static void main(String[] args) {
		
		
		//Create object using  keyword new 
		//new <className()>
		int a=10;
		 
		
		EMP e=new EMP();
		
		e.Name="Sri";
		e.Location="chicago";
		e.Fee=900;
		e.course="Selenium";
		e.cell=12345678;
		
		System.out.println(e.Name);
		System.out.println(e.Location);
		System.out.println(e.Fee);
		System.out.println(e.course);
		System.out.println(e.cell);
		
		
		EMP e1=new EMP();
		
		e1.Name="Vamsi";
		e1.course="Java";
		
		System.out.println(e1.Name);
		System.out.println(	e1.course);
		
		
		

	}

}
