package InharetanceStudy;

public class Herarchiacl {

	public static void main(String[] args) {
	 Insta i = new Insta ();
	 i.Job();
	 i.Reels();
	 Insta.Story();
	 Insta.Propetional();
	 System.out.println("=============================");
	 System.out.println("For Insta 1 Sub Class");
	 Insta1 p = new Insta1();
	 p.Job();
	 p.Photo();
	 Insta1.Music();
	 Insta1.Propetional();

	}

}
