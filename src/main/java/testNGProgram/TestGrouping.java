package testNGProgram;

import org.testng.annotations.Test;

public class TestGrouping {
	
  @Test(groups="A")
  public void f1() {
  }
  
  @Test(groups="B")
  public void g1() {
  }
  
  @Test(groups= {"A", "C"})
  public void f2() {
  }
  
  @Test(groups="A")
  public void g2() {
  }
  
  @Test(groups="C")
  public void f3() {
  }
}
