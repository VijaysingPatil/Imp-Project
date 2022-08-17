package InterfaceStudy1;

public interface Dell
{
void Camera();
void Screen();
default void Charge()
{
	System.out.println("Charging of Dell is Bettery");
}
public static void Good() 
{
	System.out.println("Dell laptop is Good ");
}
}
