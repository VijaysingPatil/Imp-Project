package InterfaceStudy;

public interface Mother
{
	void Cook();
	void look();
	 default void love()
	{
System.out.println("MOther Love ");
	}
	static void test () 
	{
		System.out.println("Mother test ");
	}
}