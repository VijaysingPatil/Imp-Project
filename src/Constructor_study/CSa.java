package Constructor_study;

public class CSa {

	int a ;
	int b;
	 
	public CSa()
	{
		a = 12 ;
		b = 34 ;
	}
	public CSa (int x, int y) 
	{
		a= x;
		b= y;
		
	}
	public static void main(String[] args) {
		
		CSa c = new CSa(9, 6);
		c.Add();
		CSa s = new CSa();
		s.Add();
		Sub();
	}
public void Add() 
{
	int sum = a+b;
	System.out.println("Sum is "+sum);
}
public static void Sub() 
{
	int a = 23;
	int b = 34;
	int sub = a-b;
	System.out.println("Sub Value is "+sub);
}
}
