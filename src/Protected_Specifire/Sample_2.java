package Protected_Specifire;

import Access_Modifire.B;

public class Sample_2 extends B 
{

	public static void main(String[] args) 
	{
	// for Public Specifire 	
     B b = new B ();
     b.sub();
     
     //Protected Specifire 
     Sample_2 s = new Sample_2();
     s.sub();
     s.sub3();
	}

}
