package Inharetance_Singlelevel;

public class Single_level_Inhiritance {

	public static void main(String[] args) 
	{
		System.out.println("For Sub Class ");
		A_sub a = new A_sub();
		a.StudentInfo();
		a.StudentAge();
		a.Studentname();
		System.out.println("==================");
		System.out.println("For Super Class ");
		
		A_sub.StudentInfo1();
		
	}

}
