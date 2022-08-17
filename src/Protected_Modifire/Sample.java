package Protected_Modifire;

import Access_Modifire.A;

public class Sample extends A      //................step 2
{

	public static void main(String[] args)
	{
		A a= new A();      //....................step 1
		a.add();

		Sample s = new Sample ();
		s.add();
		s.add3();
	}

}
