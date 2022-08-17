package This_Super_keywords;

public class A_sub extends B_Super
{
	String Name="Rohit";
	String EmpId = "Rohit@123";
	float Salary = 36445.364f;
	public static void main(String[] args) 
	{
		A_sub a= new A_sub();
		a.EmployeeInfo();
	}
	public void EmployeeInfo() 
	{   //for local variable
		String Name="Vijaysing";
		String EmpId = "Vijaysing@123";
		float Salary = 25745.364f;
		{System.out.println("Local Variable");}
		System.out.println("Employee Name is "+Name);
		System.out.println("Employee EmpId is "+EmpId);
		System.out.println("Employee Salary is "+Salary);
		System.out.println("=======================================");
		
		//Calling to Global Variable
		System.out.println("Global Variable with A_sub class");
		System.out.println("Employee Name is "+this.Name);
		System.out.println("Employee EmpId is "+this.EmpId);
		System.out.println("Employee Salary is "+this.Salary);
		System.out.println("=======================================");
		
		//Calling to Super Class
		System.out.println("Global Variable with this B_super class");
		System.out.println("Employee Name is "+super.Name);
		System.out.println("Employee EmpId is "+super.EmpId);
		System.out.println("Employee Salary is "+super.Salary);
		System.out.println("=======================================");
		
		
		
	}
	
}
