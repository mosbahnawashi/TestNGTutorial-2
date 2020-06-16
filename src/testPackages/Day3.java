package testPackages;

import org.testng.annotations.Test;

public class Day3 {
	
	@Test
	public void webloginCarLoan() {
		
		System.out.println("Web Login Car Loan Test Case");
	}
	
	@Test(dependsOnMethods={"webloginCarLoan"})
	// Try comment this: (dependsOnMethods={"webloginCarLoan"})
	public void mobileloginCarLoan() {
		
		System.out.println("Mobile Login Car Loan Test Case");
	}
	
	@Test(groups= {"Smoke"})
	public void loginAPICarLoan() {
		
		System.out.println("Login API Car Loan Test Case");
	}
	
	

}
