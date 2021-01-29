package bank;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	Account a=new Account(345552, "Sreedevi", "Kannur", 5000,1000,2,3);
	float expTotalAmnt;
	@Test
	public void test() {
		
		
		int withdrawAmt=2000;
		a.withdraw(withdrawAmt);
		int bal=5000;
		if(bal<withdrawAmt){
			System.out.println("Sorry...! Insufficient Balance..");
		}
		else{
			bal-=withdrawAmt;
		}
		
		assertEquals(bal, a.balance);
	}
	
	float principalAmnt=a.principalAmt;
	float simpleInterest;
	
	@Test
	public void test1(){
		
		this.simpleInterest=principalAmnt*2*3/100;
		a.calcTotalAmt();
		assertEquals(simpleInterest, a.SI,0);
	
	
		
		expTotalAmnt=principalAmnt+simpleInterest;
		
		assertEquals(expTotalAmnt, a.totalLoanAmt,0);
		
	}
	
	@Test
	public void test2(){
		float monthlyAmnt=expTotalAmnt/12;
		
		assertEquals(monthlyAmnt, a.monthlyAmt, 0);
	}
	@Test
	public void test3(){
		float quarterlyAmnt =expTotalAmnt/3;
		
		assertEquals(quarterlyAmnt, a.quarterlyAmt, 0);
	}
	@Test
	public void test4(){
		float yearlyAmnt=expTotalAmnt/2;
		
		assertEquals(yearlyAmnt, a.yearlyAmt, 0);
	}
	
}










