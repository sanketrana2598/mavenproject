package Alltests;

import org.testng.annotations.Test;

import Utilities.Basetest;
import Utilities.Retryanalyz;
import newpackage.newproject.Homepage;
import newpackage.newproject.Loginpage;
import newpackage.newproject.Paymentpage;

public class Payment extends Basetest{
@Test(retryAnalyzer=Retryanalyz.class)
public void Makepayment()  {
	Homepage h1 = new Homepage(w1);
	
	h1.hoverover(w1);
	
	h1.clickonsignin();
	Loginpage l1 = new Loginpage (w1);
	l1.enterusername();
	l1.cnt();
	l1.enterpwd();
	l1.submit();
	
	Homepage h2 = new Homepage(w1);
	h1.searchshoes();
	h1.Clickaddtocart();
	h1.againclickaddcart();
	h1.Cartpage();
	
	l1.proceedtopayment();
	
	Paymentpage p1 = new Paymentpage(w1);
	p1.paymode();
	p1.usethispayment();
	
}
}
