import static org.junit.Assert.*;

import org.junit.Test;

public class TestFactorial {

	@Test
	public void test() {
		
		Factorial f=new Factorial();
		int actFact=f.fact(5);
		
		int expFact = 1;
		for(int i=1;i<=5;i++)
		{
			expFact = expFact * i;
		}
			
		assertEquals(expFact,actFact);	
			
		
		
	}

}
