package CollectionsDemo;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
	test1 t1= new test1();
		ArrayList al=new ArrayList(50);
		//ArrayList al=new ArrayList(); //Default size 10
		al.add(10);
		al.add(10.25);
		al.add("srini");
		al.add(10);
		al.add(null);
		al.add(1, "java");
		al.add(10);
		al.add(10.25);
		al.add("srini");
		al.add(10);
		al.add(null);
		al.add(1, "java");
		al.add(t1);
		//System.out.println(al.get(3));
		System.out.println(al);
		
		ListIterator itr=al.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
