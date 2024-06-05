package PatternPrograms;

public class Fibonacci {

	public static void main(String[] args) 
	{
		int f =1;
		int s = 1;
		System.out.println(f);	
		System.out.println(s);
		for(int i = 3 ; i<=10 ; i++)
		{
			int t = f+s;
		System.out.println(t);
		f = s;
		s = t;
		}

	}

}
