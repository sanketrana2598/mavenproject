package Alltests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Utilities.Basetest;
import Utilities.Retryanalyz;
import newpackage.newproject.Homepage;

public class Signintoamazon extends Basetest {

	

	@Test(retryAnalyzer=Retryanalyz.class)
	public void performlogin() {
	
		Homepage h1 = new Homepage(w1);
		h1.hoverover(w1);
		
		h1.clickonsignin();
		
	}
	
}
