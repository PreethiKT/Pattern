package PatternPrograms;

public class Reverse {

	public static void main(String[] args) 
	{
		String s = "welcome to java";
		String rev = "";
		for(int i =0; i<=s.length()-1; i++)
		{
			rev =  s.charAt(i)+rev;
		}
		System.out.println(rev);
		/*if(s.equals(rev))
		{
		System.out.println(" Palindrome");
		}
		else
		{
			System.out.println(" Not Palindrome");
		}*/

	}

}
