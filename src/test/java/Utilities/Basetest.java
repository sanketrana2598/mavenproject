package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Basetest  extends Ilistners{
	
	@Parameters("input")
	@BeforeMethod

	public void launch( String a)  throws InterruptedException
	{
	if(a.equalsIgnoreCase("chrome"))
			{ w1 = new ChromeDriver();
		
			}
	if(a.equalsIgnoreCase("edge"))
	{
		w1 = new EdgeDriver();
	}
	if(a.equalsIgnoreCase("firefox"))
	{
		w1 = new FirefoxDriver();
	}


		 
		w1.get("https://www.amazon.in");
		
		w1.manage().window().maximize();

	}
	@AfterMethod
	public void close() throws InterruptedException
	{
	Thread.sleep(4000);
w1.close();
	}
}
