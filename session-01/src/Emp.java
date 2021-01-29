
public class Emp {

	private int empId;
	private String empNm;
	private float empSal;

	public Emp()//default constructor
	{
		//this(1,"xyz",34563.89f);
		System.out.println("Default Constructor invoked");
		empId = 111;
		empNm = "rahul";
		empSal = 12000.78f;
	}
	
	public Emp(int empId,String empNm,float empSal) 
	{
		this();
		System.out.println("Parameterized Constructor invoked");
		this.empId = empId;
		this.empNm = empNm;
		this.empSal = empSal;
	}
	
	public String toString()//Object class
	{
		return "Employee = ["+empId+", "+empNm+", "+empSal+"]";
	}
	
	public static void main(String[] args) {
	
		Emp e = new Emp();
		System.out.println(e);
		
		/*Emp e1 = new Emp(222,"rohan",32431.78f);
		System.out.println(e1);*/
		
	}
}
