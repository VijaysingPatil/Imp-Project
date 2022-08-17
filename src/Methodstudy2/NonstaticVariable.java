package Methodstudy2;

public class NonstaticVariable {

	//calling to same class in non static
	public static void main(String[] args) 
	{
		//object crate        ...................step2
		NonstaticVariable ns = new NonstaticVariable();
		ns.Name();
		
	//	calling anther class
		Sample s= new Sample();
		s.add();
	}
	
public void Name() 
{ 
	System.out.println("My Name is Ram");   // .......step 1
}
}
