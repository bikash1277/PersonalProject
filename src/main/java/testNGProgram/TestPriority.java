package testNGProgram;

import org.testng.annotations.Test;

public class TestPriority {
	
  @Test(priority = 0)
  public void a() {
  }
  
  @Test(priority = -5)
  public void g() {
  }
  
  @Test(priority = 1)
  public void i() {
  }
  
  @Test(priority = -1)
  public void z() {
  }
  
  @Test(priority = 9)
  public void e() {
  }
}
