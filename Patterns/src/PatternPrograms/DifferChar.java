package PatternPrograms;

public class DifferChar {

	public static void main(String[] args) 
	{
		String s = "education@!123";
		
			for(int i = 0; i <= s.length()-1; i++)
			{
				char ch = s.charAt(i);
				if(ch>'0' && ch<='9')
				{
					System.out.println(ch);
				}
				
				if(ch>'a' && ch<='z')
				{
					System.out.println(ch);
				}
				
			}
				
		
			}
	}
	
				