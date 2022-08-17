package Abstract_class;

public class Concrete_Class extends Incomplite_class {

	public static void main(String[] args) 
	{  
		//This is Concrete class
		Concrete_Class c = new Concrete_Class();
		c.Display2();
		c.Display3();
		c.Display();

	}

	@Override
	public void Display2() 
	{
		System.out.println("Display2 method define in Concrete Class");
		
	}

	@Override
	public void Display3() {

System.out.println("Display3 method define in Concrete Class ");
		
	}

}
