
public class Employee {

	private int empId;
	private String empNm;
	private float empSal;

	public Employee()//default constructor
	{
		System.out.println("Default Constructor invoked");
		empId = 111;
		empNm = "rahul";
		empSal = 12000.78f;
	}
	
	public Employee(int id,String nm,float sal) 
	{
		System.out.println("Parameterized Constructor invoked");
		empId = id;
		empNm = nm;
		empSal = sal;
	}
	
	public String toString()//Object class
	{
		return "Employee = ["+empId+", "+empNm+", "+empSal+"]";
	}
	
	public static void main(String[] args) {
	
		Employee e = new Employee();
		System.out.println(e);
		
		Employee e1 = new Employee(222,"rohan",32431.78f);
		System.out.println(e1);
		
	}

}
