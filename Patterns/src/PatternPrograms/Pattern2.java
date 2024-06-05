package PatternPrograms;

public class Pattern2 {

	public static void main(String[] args)
	{
		int row = 5;
		int col = row ;
		for(int r =1; r<= row; r++)
		{
			for(int c=1; c<=col; c++)
			{
				if(r%2!= 0)
			     System.out.print("* ");
				else
					 System.out.print("# ");
			}
			System.out.println();

		}
}
}
