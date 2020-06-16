package testPackages;

import org.testng.annotations.Test;

public class Day4 {
	
	@Test(groups= {"Smoke"})
	public void webloginHomeLoan() {
		
		System.out.println("Web Login Home Loan Test Case");
	}
	
	@Test(groups= {"Smoke"})
	public void mobileloginHomeLoan() {
		
		System.out.println("Mobile Login Home Loan Test Case");
	}
	
	@Test
	public void loginAPIHomeLoan() {
		
		System.out.println("Login API Home Loan Test Case");
	}
	
	

}
