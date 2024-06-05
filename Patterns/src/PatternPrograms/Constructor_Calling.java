package PatternPrograms;

public class Constructor_Calling 
{
	String name;
	int age;
	Constructor_Calling()
	{
		System.out.println("Animal");
	}
	Constructor_Calling( String name)
	{
		this();
		System.out.println(name);
	}
	Constructor_Calling(String name , int age)
	{
		this(name);
		System.out.println(age);
	}

	public static void main(String[] args) 
	{
		Constructor_Calling c1 = new Constructor_Calling("Butterfly",8);
	}

}
