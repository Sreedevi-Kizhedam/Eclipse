package junitDemo;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.model.TestTimedOutException;

public class TestAddition {

	@Test(timeout=4000)//,expected=TestTimedOutException.class)
	public void testAdd() throws InterruptedException {
		Thread.sleep(3000);
		AdditionTest a=new AdditionTest();
		
		
		assertEquals(5,a.additionTest() );
		
	}
	@Ignore("Already tested")
	@Test
	public void testMul(){
		MultiplicationTest m=new MultiplicationTest();
		assertEquals(6, m.multiplicationTest());
	}
}
