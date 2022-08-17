package CollectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vectorStudy {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("Rohit");
		v.add("Mayur");
		v.add("Shivam");
		v.add("Mayur");
		v.add(null);
		v.add(null);
		v.add(1996);
		v.add(123.43f);
		System.out.println(v);
		v.add("reeva");
		System.out.println(v);
		v.remove("reeva");
		v.remove(2);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v.containsAll(v));
		System.out.println(v.firstElement());
		System.out.println(v.clone());
		System.out.println("=========for loop Static testing =========");
		for(int i = 0;i<=v.size()-1;i++) {
			System.out.println(v.get(i));
		}
		System.out.println("==========for each ==========");
		for(Object r:v) {
			System.out.println(r);
		}
		System.out.println("=========iterator==========");
		Iterator r = v. iterator();
		while(r.hasNext()) {
			System.out.println(r.next());
		}
		System.out.println("=========List Iterator==========");
		ListIterator g = v.listIterator();
		while(g.hasNext()) {
			System.out.println(g.next());
		}
		System.out.println("==========Enumretion===========");
		Enumeration y = v.elements();
		while(y.hasMoreElements()) {
			System.out.println(y.nextElement());
		}
	}

}
