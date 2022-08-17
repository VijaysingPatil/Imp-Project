package CollectionStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashetStudy {

	public static void main(String[] args) {
		LinkedHashSet lh = new LinkedHashSet();
		
		lh.add("Rohit");
		lh.add("Mayur");
		lh.add("Shivam");
		lh.add("Mayur");
		lh.add(null);
		lh.add(null);
		lh.add(1996);
		lh.add(123.43f);
		System.out.println(lh);
		System.out.println(lh.isEmpty());
		lh.add("Ram");
		System.out.println(lh);
		System.out.println(lh.size());
		lh.remove("Rohit");
		System.out.println(lh);
		System.out.println("=======For Each loop=======");
		for(Object r:lh) {
			System.out.println(r);
		}
		System.out.println("========iterator======="); 
		Iterator i = lh.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
