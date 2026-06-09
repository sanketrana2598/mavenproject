package Alltests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Utilities.Basetest;
import Utilities.Retryanalyz;
import newpackage.newproject.Homepage;

public class Movetocartpage extends  Basetest {
@Test(retryAnalyzer=Retryanalyz.class)
public void Movtocartpage() {
Homepage h1 = new Homepage(w1);
	
	h1.searchshoes();
	
	h1.Clickaddtocart();
	
	h1.againclickaddcart();
	
	h1.Cartpage();
	SoftAssert s1 = new SoftAssert();
	s1.assertEquals(w1.getTitle(), "Amazon.in Shopping Cart");
}
}
