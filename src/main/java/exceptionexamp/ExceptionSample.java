package exceptionexamp;

public class ExceptionSample {
	public void display()
	{
		int a=10;
		try
		{
			int b=a/0;
		System.out.println(b);
		}
		catch(Exception e)
		{
			System.out.println("Handled");
			System.out.println(e);
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ExceptionSample objExceptionSample = new ExceptionSample();
		objExceptionSample.display();
		System.out.println("End of the statement");
		

	}

}
