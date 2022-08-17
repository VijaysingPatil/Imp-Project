package InterfaceStudy1;

public interface Hp
{
	void RAM();
	void Battery();

default void Charge () 
{
	System.out.println("HP laptop have good Charging limite ");
}
public static void Good() 
{
	System.out.println("Dell laptop is Good ");
}
}
