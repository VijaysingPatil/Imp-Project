package CollectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraryLIstStudy {

	

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("Rohit");
		a.add("Mayur");
		a.add("Shivam");
		a.add("Mayur");
		a.add(null);
		a.add(null);
		a.add(1996);
		a.add(123.43f);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.add("Ram"));
		System.out.println(a);
		System.out.println(a.remove(1));
		System.out.println(a);
		System.out.println(a.size());
		System.out.println("==========For loop ========");
        for(int i=0;i<=a.size()-1;i++) {
        	System.out.println(a.get(i));
        }
        System.out.println("==========For Each ===========");
        for(Object r:a) {
        	System.out.println(r);
        }
        System.out.println("========Iterator=============");
        Iterator r = a.iterator();
        while(r.hasNext()) {
        	System.out.println(r.next());
        }
        System.out.println("===========List Iterator==============");
        ListIterator t = a.listIterator();
        while(t.hasNext()) {
        	System.out.println(t.next());
        }
	}

}
