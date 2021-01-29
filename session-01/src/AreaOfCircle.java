import java.util.Scanner;

public class AreaOfCircle {

	int radius;
	float area;
	
	
	public void init(){
		System.out.println("Enter the radius : ");
		Scanner s = new Scanner(System.in);
		this.radius=s.nextInt();
		
	}
	public void calc(){
		
		this.area=(float) (3.14*radius*radius);
		
	}
	
public float calcArea(){
		
		this.area=(float) (3.14*radius*radius);
		return area;
	}
	public void display() {
		
		System.out.println("Area of the circle ="+area);
	}
	public static void main(String[] args) {
		
		AreaOfCircle a=new AreaOfCircle();
		a.init();
		a.calc();
		a.display();

	}

}
