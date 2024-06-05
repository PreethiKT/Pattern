package PatternPrograms;

public class Palindrome {

	public static void main(String[] args) 
	{
		int num = 121;
		int copy = num;
		int rev = 0;
		while(num>0)
		{
			int rem = num%10;
			rev = (rev*10)+ rem;
			num =  num/10;	
		}
		if (copy == rev)
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It is not a Palindrome");
		}
		

	}

}
