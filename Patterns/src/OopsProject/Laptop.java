package OopsProject;

public class Laptop extends Mobile 
{    
	public void Ram()
	{
		System.out.println("SoftDisk");
	}
	public void Memory()
	
	{
		System.out.println("4GB");

	}

	public static void main(String[] args) 
	{
	Mobile m = new Laptop();
	m.Memory();
	m.Ram();
	}

}
