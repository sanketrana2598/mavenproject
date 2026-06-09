package newpackage.newproject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Paymentpage {
	WebDriver w1;
	WebDriverWait wd = new WebDriverWait(w1,Duration.ofSeconds(5));
	@FindBy(xpath = "//span[@class=\"pmts-instrument-selector\"]/descendant::input")
	private WebElement card;
	@FindBy(linkText = "Add a new credit or debit card")
	private WebElement clickcarddetails;
	@FindBy(xpath = "//div[@data-action=\"a-popover-a11y\"]/descendant::button[@data-action=\"a-popover-close\"]")
	private WebElement cancelcard;
	@FindBy(xpath = "//span[@role=\"radio\"]/descendant::input")
	private WebElement clicknetbanking;
	@FindBy(xpath = "(//input[@name=\"ppw-instrumentRowSelection\"])[4]")
	private WebElement upipay;
	@FindBy(xpath = "(//input[@name=\"ppw-instrumentRowSelection\"])[5]")
	private WebElement emi;
	@FindBy(xpath = "(//input[@name=\"ppw-instrumentRowSelection\"])[6]")
	private WebElement cod;
	@FindBy(xpath = "//span[@id=\"checkout-primary-continue-button-id\"]/descendant::input")
	private WebElement usethispayment;
	
	public void paymode()
	{
		
		wd.until(ExpectedConditions.elementToBeClickable(clicknetbanking));
		clicknetbanking.click();
		wd.until(ExpectedConditions.elementToBeClickable(upipay));
		upipay.click();
		
		wd.until(ExpectedConditions.elementToBeClickable(emi));
		emi.click();
		wd.until(ExpectedConditions.elementToBeClickable(cod));
		cod.click();
		
		
		
	}
	public void cardpay()  {
		wd.until(ExpectedConditions.elementToBeClickable(card));
		card.click();
		wd.until(ExpectedConditions.elementToBeClickable(clickcarddetails));
		clickcarddetails.click();
		wd.until(ExpectedConditions.visibilityOf(cancelcard));
		cancelcard.click();
	}
	public void usethispayment()
	{
		
		wd.until(ExpectedConditions.elementToBeClickable(usethispayment));
		usethispayment.click();
	}
public Paymentpage(WebDriver w1) {
	
	PageFactory.initElements(w1,this);
}
}
