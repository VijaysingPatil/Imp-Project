package InterfaceStudy;

public interface Father
{
	void Mony();
	void Farm();
	default void love() 
	{
	System.out.println("Father Love");	
	}
	static void test() 
	{
		System.out.println("Father test ");
	}

}
