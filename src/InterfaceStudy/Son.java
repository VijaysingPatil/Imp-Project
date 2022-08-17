package InterfaceStudy;

public class Son implements Father,Mother {

	public static void main(String[] args)
	{
		Son s = new Son ();
		s.Cook();
        s.look();
        s.Farm();
        s.Farm();
        s.love ();//Calling Default method from both interface 
        Father.test();//Calling Static method From Father class
        Mother.test();//Calling Static method From Father class
        
	}

	@Override
	public void Cook() {
		
		System.out.println("Mother Cook is complited i son class");
	}

	@Override
	public void look() {

		System.out.println("Mother look is complited i son class");
	}

	@Override
	public void Mony() {
		System.out.println("Father Mony is complited i son class");
	}

	@Override
	public void Farm() {
		
		System.out.println("Father Farmer is complited i son class");
	}
	public void Mobile() 
	{
		
	System.out.println("Son own Property Mobile ");
	}

	@Override
	public void love()
	{
		Mother.super.love();//Calling mother love method 
		Father.super.love();//calling father love method 
		
	}

}
