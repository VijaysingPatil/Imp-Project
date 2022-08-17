package This_Super_keywords;

public class P extends Q {
	String name = "Pandurang Patil";
	float income = 135000.34f;
	int age = 45;
	

	public static void main(String[] args) {
		//For static method 
		ParentInfo();
        //for Non Static Method
		P p = new P();
		p.PrentsInfo1();
	}
private static void ParentInfo() {
	String name = "Vijay";
	float income = 26373.4848f;
	int age = 36;
	System.out.println("==============================");
		System.out.println("For Static Method");
		System.out.println("My Father Name is "+name );
		System.out.println("My Father Age is "+age );
		System.out.println("My Father income is "+income );
		
	}
public void PrentsInfo1()
{   System.out.println("======================================");
    System.out.println("Calling to Same class P global Variable");
	System.out.println("My Father Name is "+this.name );
	System.out.println("My Father Age is "+this.age );
	System.out.println("My Father income is "+this.income );
	System.out.println("======================================");
	System.out.println("Calling to other class Q global Variable");
	System.out.println("My Mother Name is "+super.name );
	System.out.println("My Mother Age is "+super.age );
	System.out.println("My Mother income is "+super.income );
}
}
