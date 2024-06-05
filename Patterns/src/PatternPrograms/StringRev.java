package PatternPrograms;

public class StringRev {

	public static void main(String[] args) 
	{
	 String s = "WelcometoJava";
	 String [] s1 = s.split("");
	 String s2 = " ";
	 for(int i = 0; i<= s1.length-1;i++)
	 {
		 s2 = s1[i];
	 
		 for(int j=s2.length()-1; j>=0; j--)
		 {
			System.out.print(s2.charAt(j));
		 }
	 }
	 
	}
}

