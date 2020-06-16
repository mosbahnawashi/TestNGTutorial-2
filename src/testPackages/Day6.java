package testPackages;

import org.testng.annotations.Test;

public class Day6 {

	@Test
	public void webloginCreditCard1() {

		System.out.println("Web Login CreditCard Loan Test Case 1");
	}

	@Test
	public void webloginCreditCardLoan2() {

		System.out.println("Web Login CreditCard Loan Test Case 2");
	}

	@Test(timeOut=1000) // If it takes more than 1000 ms it will be excluded
	public void webloginCreditCardLoan3() {

		System.out.println("@Test(timeOut=1000)");
	}

	@Test
	public void webloginCreditCardLoan4() {

		System.out.println("Web Login CreditCard Loan Test Case 4");
	}

	@Test
	public void webloginCreditCardLoan5() {

		System.out.println("Web Login CreditCard Loan Test Case 5");
	}
	
}
