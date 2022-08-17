package GlobalAndlocalVaroable;


public class Variable_study
{
	// calling to Variable
	int a =24;
	static int b =34;

	
	public static void main(String[] args)
	{
		Variable_study vs = new Variable_study ();
		vs.add();
		
		sub();
		 System.out.println("Non static Global variable is "+vs.a);
         System.out.println("Static Global Variable "+b);
         
         
         Sample3 s = new Sample3 ();
         System.out.println("Sample class Non static variable "+s.q);
       
         System.out.println("Sample class static varible "+Sample3.p);
	}
public void add() 
{
	int sum = a+b;
	System.out.println("Sum of "+sum);
}
public static void sub() 
{
	int sub = 76-b;
	System.out.println("My Sub is "+sub);
}
}
