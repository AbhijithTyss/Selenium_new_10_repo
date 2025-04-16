package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNG {//TestNg class
	
	@Test
	public void register() {
		Reporter.log("register test case executed",true);
	}
	
	@Test
	public void login() {//test case
		// test steps
		Reporter.log("login test case executed",true);
	}
	
	@Test
	public void addToCart() {
		Reporter.log("addToCart test case executed",true);
	}
	
	
}