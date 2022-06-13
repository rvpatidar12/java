package E9_7_4;

public class Student extends BusinessMan implements RichMan  
{
	public void donation()
	{
		System.out.println("Student Giving Donation");
	}
	public void party()
	{
		System.out.println("Student Giving Party");
	}
	public static void main(String[] args)
	{
		BusinessMan b=new BusinessMan();
		b.donation();
		b.party();
		
		/*
		 * RichMan r=new Student(); r.donation(); r.party();
		 */
		
		Student s=new Student();
		s.donation();
		s.party();
	}
}
