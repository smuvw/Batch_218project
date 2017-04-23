package CollectionsDemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList LL= new LinkedList();
		LL.add("srini");
		LL.add(10);
		LL.add(10.23);
		LL.add(1, "vamsi");
		
		System.out.println(LL);
		
		
		ArrayList Al= new ArrayList(LL);
		
		System.out.println(LL);

	}

}
