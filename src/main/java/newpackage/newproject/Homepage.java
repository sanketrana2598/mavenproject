package newpackage.newproject;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage  {
	
	WebDriver w1;
	WebDriverWait wd = new WebDriverWait(w1,Duration.ofSeconds(5));
	@FindBy (xpath ="//span[text()='Hello, sign in']")
	private WebElement accountandlists;
	
	@FindBy (xpath ="//span[text()='Sign in']")
	private WebElement signin;
	
	@FindBy (id="twotabsearchtextbox")
	private WebElement searchbox;
	
	@FindBy (xpath ="//span[@id=\"nav-cart-count\"]/following-sibling::span")
	private WebElement clickaddtocart;
	
	@FindBy (xpath ="(//div[@id=\"a-popover-content-2\"]/descendant::button)[1]")
	private WebElement againclickaddcart;
	
	@FindBy (xpath ="//span[@data-a-selector=\"decrement-icon\"]")
	private WebElement removefromcart;
	
	@FindBy (linkText ="Go to Cart")
	private WebElement cartpage;
	
	
	public void hoverover(WebDriver w1)
	{wd.until(ExpectedConditions.visibilityOf(accountandlists));
		Actions a1=new Actions(w1);
		a1.moveToElement(accountandlists).perform();
	}
	public void clickonsignin()
	{
		wd.until(ExpectedConditions.elementToBeClickable(signin));
		signin.click();
	}
	public void searchshoes()
	{
		wd.until(ExpectedConditions.visibilityOf(searchbox));
		searchbox.sendKeys("shoes",Keys.ENTER);
	}
	public void Clickaddtocart()
	{
		wd.until(ExpectedConditions.elementToBeClickable(clickaddtocart));
		clickaddtocart.click();
	}
	public void againclickaddcart()
	{
		wd.until(ExpectedConditions.elementToBeClickable(againclickaddcart));
		againclickaddcart.click();
	}
	public void Removefromcart()
	{
		wd.until(ExpectedConditions.elementToBeClickable(removefromcart));
		removefromcart.click();
	}
	public void Cartpage()
	{
		wd.until(ExpectedConditions.elementToBeClickable(cartpage));
		cartpage.click();
	}
	
	
	
	public Homepage(WebDriver w1) {
		
		PageFactory.initElements(w1,this);
	}
}

