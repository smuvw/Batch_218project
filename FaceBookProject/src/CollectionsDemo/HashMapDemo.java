package CollectionsDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap m= new HashMap();
		
		LinkedHashMap m= new LinkedHashMap();
		m.put(1, "srini");
		m.put(2, "vamsi");
		m.put(3, "Anu");
		m.put("sr.no", "Anu1");
		
		System.out.println(m);
		
		Set s1=m.keySet();
		System.out.println(s1);
		Collection s2=m.values();
		System.out.println(s2);
	}

}
