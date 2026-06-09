package Alltests;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Utilities.Basetest;
import Utilities.Retryanalyz;
import newpackage.newproject.Homepage;
import newpackage.newproject.Loginpage;

public class Signintoamazon extends Basetest {

	

	@Test(retryAnalyzer=Retryanalyz.class)
	public void performsignin() {
	
		Homepage h1 = new Homepage(w1);
		h1.hoverover(w1);
		
		h1.clickonsignin();
		
		Loginpage l1 = new Loginpage(w1);
		l1.enterusername();
		l1.cnt();
		l1.enterpwd();
		l1.submit();
		
		SoftAssert sa = new SoftAssert() ;
		sa.assertEquals(w1.getTitle(), "Your Amazon.in");
		Reporter.log("login successfull");
	}
	
}
