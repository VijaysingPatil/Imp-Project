package Access_Modifire;

public class B {

	public static void main(String[] args)
	{  
		B b = new B ();
		b.sub();
		b.sub1();
		b.sub2();
		b.sub3();
		

	}
 public void sub() 
 {
	 System.out.println("Public Method is Sub");
 }
 private void sub1() 
 {
	 System.out.println("Private Method is sub1");
 }
 void sub2() 
 {
	 System.out.println("Default Method is sub2");
	 
 }
 protected void sub3() 
 {
	 System.out.println("Protected Method is sub3 ");
 }
}
