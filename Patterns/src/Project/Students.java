package Project;

public class Students extends Person
{
	private int studid;
	private String coursename;

	
	public Students(String name, int age, String loc, String department, int studid, String coursename) {
		super(name, age, loc);
		this.studid = studid;
		this.coursename = coursename;
	}


	public int getStudid() {
		return studid;
	}


	public void setStudid(int studid) {
		this.studid = studid;
	}


	public String getCoursename() {
		return coursename;
	}


	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}


	public void details2() {
		System.out.println(this.getName());
		  System.out.println(this.getAge());
		  System.out.println(this.getLoc());
		  
		  System.out.println(this.getStudid());
		  System.out.println(this.getCoursename());

		
	}

	

}
