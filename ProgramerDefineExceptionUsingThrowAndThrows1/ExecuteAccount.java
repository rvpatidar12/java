package ProgramerDefineExceptionUsingThrowAndThrows;
public class ExecuteAccount 
{
	public static void main(String[] args)throws Exception 
	{
		InsufficientException a = new InsufficientException();
		a.deposit(1000);
		a.withdrawal(400);
		
		
	}
	
}
