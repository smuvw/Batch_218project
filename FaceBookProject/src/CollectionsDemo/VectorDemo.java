package CollectionsDemo;

import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v= new Vector();
		v.add(10);
		v.add(null);
		v.add("srini");
		v.addElement("sam");
		
		System.out.println(v);
		
		
		LinkedList LL= new LinkedList(v);
		System.out.println(LL);
	}

}
