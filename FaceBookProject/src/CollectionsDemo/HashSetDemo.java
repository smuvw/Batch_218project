package CollectionsDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashSet h= new HashSet();
		LinkedHashSet  h= new LinkedHashSet();
		h.add(10);
		h.add(null);
		h.add("srini");
		h.add(10.23);
		System.out.println(h.add(10));
				
		System.out.println(h);		

	}

}
