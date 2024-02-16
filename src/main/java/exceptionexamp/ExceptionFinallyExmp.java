package exceptionexamp;

public class ExceptionFinallyExmp {
	public void display()
	{
		int a=10;
		try
		{
			int b=(a/0);
			System.out.println(b);  //will not execute
		}
		finally
		{
			System.out.println("Finally blocked");
		}
	}

	public static void main(String[] args) {
		 ExceptionFinallyExmp objExceptionFinallyExmp=new  ExceptionFinallyExmp();
		 objExceptionFinallyExmp.display();
		 System.out.println("End of the statement"); // will not execute
	}

}
