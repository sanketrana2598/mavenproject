package Alltests;

import org.testng.annotations.Test;

import Utilities.Basetest;
import Utilities.Retryanalyz;
import newpackage.newproject.Homepage;

public class AddcartandRemove extends Basetest {
	@Test(retryAnalyzer=Retryanalyz.class)
public void Addingcartandremove()
{
	Homepage h1 = new Homepage(w1);
	
	h1.searchshoes();
	
	h1.Clickaddtocart();
	
	h1.againclickaddcart();
	
	h1.Removefromcart();

}
}
