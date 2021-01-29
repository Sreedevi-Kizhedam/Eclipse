
public class MyDate {
	
	private int d,m,y;

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public static void main(String[] args) {
		MyDate d=new MyDate();
		d.setD(21);
		int day=d.getD();
		System.out.println("Day = "+day);
		
		d.setM(1);
		System.out.println("Month = "+d.getM());
		
		d.setY(2021);
		System.out.println("Year = "+d.getY());
	}
}
