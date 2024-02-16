package throwException;

public class ThrowExc {
	public void ageMeth(int a)
	{
		if(a<18)
		{
			throw new ArithmeticException("not eligible");
		}
		else
		{
			System.out.println("Eligible for Driving License");
		}
	}

	public static void main(String[] args) {
		ThrowExc objThrowExc=new ThrowExc();
		objThrowExc.ageMeth(2);

	}

}
