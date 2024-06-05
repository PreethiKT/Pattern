package PatternPrograms;

import java.util.Scanner;

public class Demo
 {
	String brand;
	double price;
	String Flavour;
	Demo()
	{
		System.out.println("Hi");
	}
	Demo(String Brand)
	{
		this.brand = brand;
	}
	Demo(String brand, double price)
	{
		this.brand = brand;
		this.price = price;
	}
	Demo(String brand , double price , String Flavour)
	{
		this.brand = brand;
		this.price = price;
		this.Flavour = Flavour;
	}
	public static void main(String[] args) 
	{
		
	Demo d1 = new Demo();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the brand");
	String b = sc.next();
	System.out.println("Enter the price");
	double p = sc.nextDouble();
	Demo d2 = new Demo(b,p);
	Demo d3 = new Demo("Kitkat",10,"vanila");
	d2.Flavour = "milk";
	details(d1);
	details(d2);
	details(d3);
	}
	public static void details(Demo obj)
	{
		System.out.println("brand" + obj.brand);
		System.out.println("price" + obj.price);
		System.out.println("Flavour" + obj.Flavour);

	
	
	
	}

}
