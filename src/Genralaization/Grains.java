package Genralaization;

public class Grains {

	public static void main(String[] args) {
		
		Maharastra m = new Maharastra();
		m.wheat();
		m.millet();
		m.maize();
		System.out.println("============================");
		UP u = new UP ();
		u.wheat();
		u.millet();
		u.maize();
		System.out.println("============================");
		MP p = new MP ();
		p.wheat();
		p.millet();
		p.maize();
		
	}

}
