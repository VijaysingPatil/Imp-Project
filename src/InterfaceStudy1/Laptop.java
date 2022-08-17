package InterfaceStudy1;

public class Laptop implements Hp,Dell {

	public static void main(String[] args) {
		Laptop h = new Laptop ();
h.Battery();
h.Camera();
h.Charge();
h.RAM();
h.Screen();

System.out.println("=========================");
System.out.println("for Static");
Dell.Good();
Hp.Good();

	}

	@Override
	public void Camera() {
		System.out.println("Good clearity of Dell Camera ");
	}

	@Override
	public void Screen() {
		System.out.println("Good clearity of Dell Screen ");
		
	}

	@Override
	public void RAM() {
		System.out.println("RAM of Hp is 32 GB ");
	}

	@Override
	public void Battery() {
		
		System.out.println("Battery Backup is Hp is very Good ");
	}

	@Override
	public void Charge() {
		System.out.println("==============================");
		System.out.println("For same method name and diff Defination ");
		Dell.super.Charge();
		Hp.super.Charge();
	}

}
