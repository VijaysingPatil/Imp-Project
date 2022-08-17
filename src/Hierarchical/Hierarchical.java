package Hierarchical;

public class Hierarchical {

	public static void main(String[] args) 
	{
		//for Non static method
		System.out.println("For Shivam  Sub Class ............Static & Non Static Method   ");
		Shivam s = new Shivam();
		s.Study();
		s.Strugal();
		System.out.println("===========================================================");
		//For Static method 
		System.out.println("For Rohit Sub Class ..............Static & Non Static Method ");
		Rohit r = new Rohit ();
		r.Job();
		r.Strugal();

	}

}
