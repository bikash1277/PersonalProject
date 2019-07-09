package testNGInterviewPreparation;

import org.testng.annotations.Test;

public class TestDependencyTest {
	
  @Test(priority = 1)
  public void z() {
  }
  
  @Test(priority = 2, dependsOnMethods = "z")
  public void j() {
  }
  
  @Test(priority=8)
  public void p() {
  }
  
  @Test(priority=8, dependsOnMethods = "p")
  public void h() {
  }
}
