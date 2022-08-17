package MethodStudy1;

public class Staticvariable {

	// ...Static  method Calling to same class..... 
	
	
	public static void main(String[] args)
	{ 
		test();     //calling to static method............step 2 
		// class name.method name
		SampleClass.test2();
	}
	public static void test()
 { 
	 System.out.println("Hi My Name is Rohit");  // print.....step 1
	 
 }
 

}
