package string_method;

public class method {

	public static void main(String[] args) {
		//for length method  
		String a1= "Mayur";
		System.out.println(a1.length());
		int a2=a1.length();
		System.out.println(a2);
		System.out.println("=================");
		//for to upper
		String a3= "Vijaysing";
		System.out.println(a3.toUpperCase());
		String a4 = a3.toUpperCase();
		System.out.println(a4);
		System.out.println("=======================");
		//for tolower
		String a5 = "Vijaysing";
		System.out.println(a5.length());
		String a6 = a5.toLowerCase();
		System.out.println(a6);
		System.out.println("====================");
		//for equal
		String b1="Shivam";
		String b2="Shivam";
		String b3= new String("Shivam");
		String b4= new String ("Shivam");
		String b5=new String("shivam");
		System.out.println(b1==b2);
		System.out.println(b2==b3);  //check memmory location
		System.out.println(b3==b4);
		System.out.println(b4==b5);
		System.out.println("================");
		System.out.println(b1.endsWith(b2));
		System.out.println(b2.endsWith(b3)); // check contain
		System.out.println(b4.endsWith(b5));
		System.out.println("===========================");
		// is Empty
		String c1 = "";
		String c2 = " ";
		String c3 = "Vijay";
		System.out.println(c1.isEmpty());
		System.out.println(c2.isEmpty());
		System.out.println(c3.isEmpty());
		System.out.println("===================");
		//charAt
		String d1 = "Pune";
		System.out.println(d1.charAt(3));
		System.out.println(d1.charAt(1));
		System.out.println("==============");
		//end with
		String g1 = "Vijay";
		System.out.println(g1.endsWith("jay"));
		System.out.println(g1.endsWith("ija"));
		System.out.println("=================");
		// start with
		String h1 = "Mayur";
		System.out.println(h1.startsWith("May"));
		System.out.println(h1.startsWith("ayu"));
		System.out.println("============================");
		//Substring
		String r1 = "Pandurang";
		System.out.println(r1.substring(3));
		String j1 = r1.substring(3);
		System.out.println(j1);
		System.out.println(r1.substring(2, 8));
	    System.out.println("===========================");
		//concat 
		String t1 = "Vijaysing";
		String t2 = "Pandurang Patil";
		System.out.println(t1.concat(t2));
		System.out.println("===========================");
		//index of 
		String i1 = "Shivam";
		System.out.println(i1.indexOf('i'));
		System.out.println(i1.indexOf('m'));
		
		String i2 = "My Brother is Shivam ";
		System.out.println(i2.indexOf('r'));
		System.out.println(i2.lastIndexOf("Shi"));
		System.out.println(i2.indexOf('o', 4));
		System.out.println("=====================");
         // replace 
		String h8 = "rajpurohit";
		System.out.println(h8.replace('o', 'i'));
		System.out.println(h8.replace("rohit", "r"));
		
		
		
	}

}
