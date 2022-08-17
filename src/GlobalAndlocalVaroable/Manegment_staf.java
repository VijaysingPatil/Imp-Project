package GlobalAndlocalVaroable;

public class Manegment_staf {

	public static void main(String[] args)
	{
		College_Student cs = new College_Student();
		
		 cs.name = "Vijaysing patil";
		 cs.gender = 'M';
		 cs.fees = 12456.65f;
		 cs.subject = "Science";
         cs.roll = 25;
         
         College_Student s = new College_Student();
         
         
         s.name = "Mayur Sanjai Patil";
         s.gender = 'M';
         s.fees = 4365.867f ;
         s.subject = "Math";
         s.roll = 45;
         
         
         
         
         College_Student k = new College_Student();
         k.name = "Shivam patil";
         k.gender = 'M';
         k.fees = 12453.678f;
         k.subject = "English";
         k.roll = 58;
         
         k.studentinfo();
         cs.studentinfo();
         
         s.studentinfo();
         
        
	}

}
