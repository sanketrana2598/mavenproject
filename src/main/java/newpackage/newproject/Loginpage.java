package newpackage.newproject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {
WebDriver w1;
WebDriverWait wd = new WebDriverWait(w1,Duration.ofSeconds(5));
	@FindBy(id = "ap_email_login")
	private WebElement username;
	
	@FindBy(id = "ap_password")
	private WebElement pwd;
	
	@FindBy(id = "signInSubmit")
	private WebElement submit;
	
	
	@FindBy(id = "continue")
	private WebElement continuebutton;
	
	
	
	@FindBy(name = "proceedToRetailCheckout")
	WebElement proceedtopay;
	
	
	
	
	
	public void enterusername()
	{
		wd.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("sanket2598@gmail.com");
	}
	public void cnt()
	{
		wd.until(ExpectedConditions.elementToBeClickable(continuebutton));
		continuebutton.click();
	}
	
	public void enterpwd()
	{wd.until(ExpectedConditions.visibilityOf(pwd));
		pwd.sendKeys("Sanket@12345@");
	}
	public void submit()
	{
		wd.until(ExpectedConditions.elementToBeClickable(submit));
		submit.click();
	}
	
	public void proceedtopayment()
	{
		wd.until(ExpectedConditions.elementToBeClickable(proceedtopay));
		proceedtopay.click();
	}
public Loginpage(WebDriver w1) {
		
		PageFactory.initElements(w1,this);
	}
	
}
