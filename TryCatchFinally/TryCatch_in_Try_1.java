package TryCatchFinally;



public class TryCatch_in_Try_1
{
	public static void main(String[] args) 
	{
		int k=0,i=15;
		String n = "vijay";
		
		try
		{
			System.out.println("length of name is "+n.charAt(6));
			double d=i/k;
			
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("String choti hai");
		}
		
		catch(Exception e1){
			System.out.println("Divided By Zero");
	        System.exit(0);
		}
	
		finally
		{
			System.out.println("enter nhi krna hai");
		}

     }
}
