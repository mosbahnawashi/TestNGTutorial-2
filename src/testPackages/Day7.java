package testPackages;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day7 {
	
	@Test
	public void webloginCarLoan() {
		
		System.out.println("Web Login Car Loan Test Case");
	}
	
	@Parameters({"URL"})
	@Test
	public void mobileloginCarLoan(String urlname) {
		
		System.out.println("Mobile Login Car Loan Test Case");
		System.out.println(urlname);
	}
	
	@Test
	public void loginAPICarLoan() {
		
		System.out.println("Login API Car Loan Test Case");
	}
}
