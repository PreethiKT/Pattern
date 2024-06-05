package PatternPrograms;

public class StringDupli 
{

	public static void main(String[] args) 
	{
		String s = "mahabharatha";
		
		for(char ch = 'a'; ch <= 'z'; ch++)
		{
			int count=0;
			for(int i = 0; i <= s.length()-1; i++)
			{
				if(ch == s.charAt(i))
				{
					count++;
				}	
			}
			if(count >1)
				System.out.println(ch);
		}

	}

}
