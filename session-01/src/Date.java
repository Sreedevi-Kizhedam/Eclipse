
public class Date {
	//instance variable
	int dd,mm,yy;
	
	public void initDate()
	{
		System.out.println("Init called");
		dd=21;
		mm=1;
		yy=2021;
		
	}
	
	public void displayDate(){
		System.out.println("Date = ["+dd+"/"+mm+"/"+yy+"]");
	}
	public static void main(String[] args) {
		
		Date d= new Date();
		d.initDate();
		d.displayDate();

	}

}
