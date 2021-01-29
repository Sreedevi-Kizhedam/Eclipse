import java.util.Scanner;

public class Factorial {

	public int fact(int no)
	{
		int f = 1;
		for(int i=1;i<=no;i++)
		{
			f = f * i;
		}
		
		return f;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Factorial ob = new Factorial();
		
		System.out.println("Enter any Number = ");
		int no = s.nextInt();
		
		System.out.println("Factorial of "+no+" is = "+ob.fact(no));
		/*
		System.out.println("Enter a character = ");
		char ch = s.next().charAt(0);
		System.out.println("Ch = "+ch);
		*/
		
	}
}
