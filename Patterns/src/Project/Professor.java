package Project;

public class Professor extends Person 
{
  String department ;

public Professor(String name, int age, String loc, String department) {
	super(name, age, loc);
	this.department = department;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}
  public void details()
  {
	  System.out.println(this.getName());
	  System.out.println(this.getAge());
	  System.out.println(this.getLoc());
	  System.out.println(this.getDepartment());
  }


}


