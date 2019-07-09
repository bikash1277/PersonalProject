package testNGInterviewPreparation;

import org.testng.annotations.*;

public class FirstTestNGClass {
	
  @Test
  public void f1() {
	  System.out.println("Inide F1()");
  }
  
  @Test
  public void f2() {
	  System.out.println("Inside F2()");
  }
  
  @Test(invocationCount=3, invocationTimeOut= 2000)
  public void f3() {
	  System.out.println("Inside F3()");
  }
  

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before every test method");
	  
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("After every test method");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before any test function in this class");
  }
  
  @AfterClass
  public void afterClass() {
	  System.out.println("After all the test functions in this class");
  }
  
  
}
