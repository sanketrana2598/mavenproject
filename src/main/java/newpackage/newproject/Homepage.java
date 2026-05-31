package newpackage.newproject;

import java.time.Duration;

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
	WebElement accountandlists;
	
	@FindBy (xpath ="//span[text()='Sign in']")
	WebElement signin;
	
	
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
	
	public Homepage(WebDriver w1) {
		
		PageFactory.initElements(w1,this);
	}
}

