package Multi_level_inheritance;

public class Multi_level {

	public static void main(String[] args) 
	{   // for Static method 
		System.out.println("For Static Method ");
		Shivam s  = new Shivam ();
		s.College();
		s.Home();
		s.Job();
		System.out.println("============================");
		
		//For Non Static Method 
		System.out.println("For Non Static Method ");
		Shivam.Study();
		Shivam.Computer();
		Shivam.Mony();
		
		
		
		
	}

}
