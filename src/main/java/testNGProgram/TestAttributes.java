package testNGProgram;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAttributes {
	
  @Test(dependsOnMethods = "f2", alwaysRun=true)
  public void f1() {
  }
  
  @Test
  public void f2() {
	  Assert.assertEquals(2, 3);
  }
  
}
