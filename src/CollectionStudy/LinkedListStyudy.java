package CollectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStyudy {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("Rohit");
		l.add("Mayur");
		l.add("Shivam");
		l.add("Mayur");
		l.add(null);
		l.add(null);
		l.add(1996);
		l.add(123.43f);
		System.out.println(l);
		l.add("Mayur");
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		System.out.println(l.get(3));
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.equals(l));
		System.out.println(l.indexOf(4));
        System.out.println("========For Each=======");
        for(Object r:l) {
        	System.out.println(r);
        }
        System.out.println("======Iteration======");
        Iterator r = l.iterator();
        while(r.hasNext()) {
        	System.out.println(r.next());
        }
        System.out.println("======Listiterator========");
        ListIterator li = l.listIterator();
        while(r.hasNext()) {
        	System.out.println(r.next());
        }
       
       
    	   
	
        
	}

}
