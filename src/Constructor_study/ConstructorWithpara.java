package Constructor_study;

public class ConstructorWithpara {

	int a;
	int b;
	int c;
	
	public ConstructorWithpara (int x,int y,int z) // with parameter
	{
		a=x;
		b=y;
		c=z;
	
	}
	public ConstructorWithpara () 
	{
		a= 34;
		b= 35;
		c= 56;		
		
		
	}
	
	
	public static void main(String[] args)
	
	{ ConstructorWithpara cw = new ConstructorWithpara(23,35,67);
		cw.add();
        
		ConstructorWithpara c = new ConstructorWithpara();
		c.add();
		
		sub();
	}
 public void add() 
 {
	 int sum =  a+b+c;
	 System.out.println("sum of "+sum);
 }
 public static void sub() 
 {
	 System.out.println("Hi i am rohit ");
 }
}
