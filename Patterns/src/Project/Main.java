package Project;

public class Main {

	public static void main(String[] args) 
	{
		Professor phys = new Professor("Rajesh",24,"Udupi","CSE");
		phys.details();
		Students std = new Students( "ram", 34,"banglore", " ECE", 123 , "java");
		std.details2();
	}

}
