package PatternPrograms;

public class Patternprac1 
{
	public static void main(String[] args)
	{
		int row = 5;
		int col = row;
		int mid = (row/2)+1;
		for(int r=1; r<=row; r++)
		{
		for(int c=1; c<=col; c++)
		{
			if(r == 1 || r == row || c == 1 || c == col)
			//{
			//if(r == mid || c == mid || (r==1 && c <= mid) || (r == row && c>=mid) || (c ==1 && r > mid)|| (c == col && r <= mid))
			System.out.print("*");
			else
				System.out.print(" ");		
		}
		System.out.println();
		}
		}
	}

//}
