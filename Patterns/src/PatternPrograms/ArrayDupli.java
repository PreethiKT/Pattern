package PatternPrograms;

public class ArrayDupli {

	public static void main(String[] args) 
	{
		int [] a = { 10,20,30,40,10,20,100,80};
		for(int i =0; i <a.length-1 ; i++ )
		{
			for(int j =i+1; j <a.length ; j++ )
			{
				if(a[i] == a[j])
					System.out.println(a[i]);
			}
		}

	}

}
