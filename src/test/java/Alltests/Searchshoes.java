package Alltests;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Utilities.Basetest;
import Utilities.Retryanalyz;
import newpackage.newproject.Homepage;

public class Searchshoes extends Basetest  {
@Test(retryAnalyzer=Retryanalyz.class)
public void searchshoesamazon()
{
	Homepage h1 = new Homepage(w1);
	h1.searchshoes();
	
	SoftAssert sa = new SoftAssert() ;
	sa.assertTrue(w1.getTitle().contains("shoes"));
	Reporter.log("searching successfull");
	
	
	
	
	}



}
