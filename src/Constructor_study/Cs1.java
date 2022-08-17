package Constructor_study;

public class Cs1 {

	int a ;
	int b ;
	 
	public Cs1() 
	
	{
	a=23;
	b=24;
	}
	public Cs1(int x,int y) 
	
	{
	a=x;
	b=y;
	}

	public static void main (String[]args)
	{
	// for Zero Parameter
	Cs1 c = new Cs1();
	c.Add();

	//for With parameter

	Cs1 s = new Cs1(6,7);
	s.Add();

	//for static method
	Sub();

	}

	public void Add(){

	int sum = a+b;

	System.out.println("Sum of a & b is "+sum); }


	public static void Sub(){

	int q = 12;
	int sub = 50-q;
	System.out.println("Sub is "+sub); }
	}

	
