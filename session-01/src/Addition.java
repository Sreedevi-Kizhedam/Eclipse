
public class Addition {

	public void add(int a,int b) {
		int c=a+b;
		System.out.println("c = "+c);
	}
	
	public int add(int a,int b,int c){
		return (a+b+c);
	}
	public void add(int a,int b,int c,int d){
		System.out.println("Addition = "+(a+b+c+d));
	}
	public static void main(String[] args) {
		Addition a = new Addition();
		a.add(10, 22);
		System.out.println("Sum ="+a.add(10, 20, 30));
		a.add(1, 2, 3, 4);
	}
}
