package nullPointer;

public class Nullexamp {

	public static void main(String[] args) {
		try
		{
			String s =null;
			System.out.println(s.length());
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
		System.out.println("Rest of the code");

	}

}
