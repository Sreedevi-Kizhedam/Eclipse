package bank;

public class Account {

	int accountNo;
	String accHolderName;
	String branchName;
	int balance;

	float principalAmt,tenure;
	float totalLoanAmt;
	float rateOfInterest,SI;
	
	
	
	public Account(int accountNo, String accHolderName, String branchName, int balance,float principalAmt, float tenure, float rateOfInterest) {
		super();
		this.accountNo = accountNo;
		this.accHolderName = accHolderName;
		this.branchName = branchName;
		this.balance = balance;
		this.principalAmt = principalAmt;
		this.tenure = tenure;
		this.rateOfInterest = rateOfInterest;
	}
	
	
	public void withdraw(int amount){
		int withdrowalAmt=amount;
		if(withdrowalAmt<balance){
			balance=balance-withdrowalAmt;
			System.out.println("New balance is : "+balance);
		}
		else{
			System.err.println("Sorry...! Insufficient Balance..");
		}
	}


	
	public void calcTotalAmt(){
		SI=principalAmt*rateOfInterest*tenure/100;
		totalLoanAmt=principalAmt+SI;
		
	}
	float monthlyAmt,quarterlyAmt,yearlyAmt;
	
	public void amountToBePaid(){
		
		monthlyAmt=totalLoanAmt/12;
		quarterlyAmt=totalLoanAmt/3;
		yearlyAmt=totalLoanAmt/tenure;
		}
	
	public static void main(String[] args) {
		Account a=new Account(345552, "Sreedevi", "Kannur", 5000,1000,2,3);
		a.withdraw(2000);
	
		
		a.calcTotalAmt();
		System.out.println(a.totalLoanAmt);
		a.amountToBePaid();
		
		System.out.println("If paying monthly amount to be paid is "+a.monthlyAmt);
		System.out.println("If paying quarterly amount to be paid is "+a.quarterlyAmt);
		System.out.println("If paying yearly amount to be paid is "+a.yearlyAmt);
	}
	
}
