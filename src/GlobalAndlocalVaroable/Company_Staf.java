package GlobalAndlocalVaroable;

public class Company_Staf {

	public static void main(String[] args) {
		Emp_Info e = new Emp_Info();
		e.Name="Vijaysing";
		e.Age=38;
		e.Gender='M';
		e.Sallery=27874.4849f;
		
		Emp_Info r = new Emp_Info();
		r.Name="jaysing";
		r.Age=48;
		r.Gender='M';
		r.Sallery=67874.4849f;
		
		e.EmpInformation();
		r.EmpInformation();
		

	}

}
