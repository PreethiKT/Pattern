package PatternPrograms;

public class Amstrong {

	public static void main(String[] args) 
	{
		int num = 153;
		int copy = num;
		int temp = num;
		int sum = 0;
		int count = 0;
		while(num>0)
		{
			num = num/10;
			count ++;	
		}
		while(copy>0)
		{
			int rem = copy%10;
			int res = findPower(rem,count);
			sum = sum + res;
		    copy = copy/10;
		}
		if (sum == temp)
		
			System.out.println("it is Amstrong number");
		
		else
		
			System.out.println("it is not a Amstrong number");
	}
		
		public static int findPower(int base, int power)
		{
			int prod = 1;
			for(int i=1; i<= power ; i++)
			{
				prod = prod * base;
			}
			return prod;

	}

}
