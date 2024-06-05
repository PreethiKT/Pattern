package PatternPrograms;

public class Pattern5 {

	public static void main(String[] args) 
	{
		int row =4;
		int space = row-1;
		char ch ='A';
		for(int r=1; r<=row; r++)
		{
			for(int s=1; s<=space; s++)
			{
				System.out.print(" ");
			}
			for(int c=1; c<=ch; c++)
			{
				System.out.print(ch);
			}
			space--;
			ch++;
			System.out.println();
		}
		
		

	}

}
