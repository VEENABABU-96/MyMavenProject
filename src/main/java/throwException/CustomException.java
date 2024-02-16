package throwException;

public class CustomException {
	public void votingMeth(int age) throws AgeException
{
		if (age<18)
		{
			throw new AgeException("Not Eligible");
		}
		else
		{
			System.out.println("Eligible");
		}
}
	public static void main(String[] args) throws AgeException {
		
		CustomException objCustomException=new CustomException();
		objCustomException.votingMeth(18);
	}

}
