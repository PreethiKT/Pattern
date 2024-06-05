package PatternPrograms;

public class Repeating {

	public static void main(String[] args) 
	{
			String s = "WelcometoSelenium";
			
			int count=0;
			for(int i = 0; i <= s.length()-1; i++)
			{
				 char ch = s.charAt(i);
				 if(ch=='e')
				 {
					count++;
				}	
			}
		//	if(count ==1)
				System.out.println(count);
		}




		

	


	}


