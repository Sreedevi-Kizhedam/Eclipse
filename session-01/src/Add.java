
public class Add {

	public int add(int... a) {
		int sum=0;
		int len=a.length;
		System.out.println("Length ="+len);
		for(int i=0;i<len;i++){
			sum+=a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
	
		Add a=new Add();
		System.out.println(a.add(1,2));
		System.out.println(a.add(1,2,3,4,5));
		
	}

}
