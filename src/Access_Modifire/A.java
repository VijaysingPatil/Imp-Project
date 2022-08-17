package Access_Modifire;

public class A {

	public static void main(String[] args)
	{
		A a= new A ();
		a.add();
		a.add1();
		a.add2();
		a.add3();
		
		

	}
public void add() 
{
	System.out.println("Public Method is add ");
}
private void add1() 
{
	System.out.println("Private Method is add1");
	
}
void add2() 
{
	System.out.println("Default Method is add2");
}
protected void add3() 
{
	System.out.println("Protected Method is add3");
}
}
