package testNGProgram;

import org.testng.annotations.Test;
import org.testng.Assert;


public class NewTestOne {
	@Test
	public void test1(){
		System.out.println("Test 1");
		Assert.assertTrue(true);
		
	}
}
