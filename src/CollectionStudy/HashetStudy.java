package CollectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashetStudy {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("Rohit");
		h.add("Mayur");
		h.add("Shivam");
		h.add("Mayur");
		h.add(null);
		h.add(null);
		h.add(1996);
		h.add(123.43f);
		System.out.println(h);
        System.out.println(h.size());
        System.out.println(h.contains(h));
        h.add("Vaibhav");
        System.out.println(h);
        h.remove("Rohit");
        System.out.println(h);
        System.out.println("==========For loop  Dynamic =========");
        for(int i = 0;i<=h.size()-1;i++) {
        	System.out.println(h);
        }
        System.out.println("==============For Each ============");
        for(Object a:h) {
        	System.out.println(a);
        }
        System.out.println("=============For Iteration=============");
        Iterator i = h.iterator();
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
	}

}
