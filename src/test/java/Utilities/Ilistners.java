package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class Ilistners implements ITestListener{
	public static WebDriver w1;
	@Override
	public void onTestSuccess(ITestResult result) {
		 Date d1 = new Date();
	      System.out.println(d1);
	    System.out.println(d1.getTime());  
	    
	    Date d2 = new Date(d1.getTime());
	    		System.out.println(d2);
	    		
	    		String d3 = d2.toString();
	    		System.out.println(d3);
	    		String time = d3.substring(11, 19);
	    		String Month = d3.substring(4, 7);
	    		String year = d3.substring(d3.length()-4);
	    		String date  = d3.substring(8,10);
	    		
		String format1 = date.concat(" ").concat(Month).concat(" ").concat(year);
	System.out.println(format1);
			TakesScreenshot  ts = (TakesScreenshot) w1;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\Admin\\eclipse-workspace\\Automationtest\\test-output\\screenshot\\pass\\"+format1+".png");
		
			try {
				FileHandler.copy(source,destination);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		 Date d1 = new Date();
	      System.out.println(d1);
	    System.out.println(d1.getTime());  
	    
	    Date d2 = new Date(d1.getTime());
	    		System.out.println(d2);
	    		
	    		String d3 = d2.toString();
	    		System.out.println(d3);
	    		String time = d3.substring(11, 19);
	    		String Month = d3.substring(4, 7);
	    		String year = d3.substring(d3.length()-4);
	    		String date  = d3.substring(8,10);
	    		
		String format1 = date.concat(" ").concat(Month).concat(" ").concat(year);
	System.out.println(format1);
			TakesScreenshot  ts = (TakesScreenshot) w1;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\Admin\\eclipse-workspace\\Automationtest\\test-output\\screenshot\\pass\\"+format1+".png");
		
			try {
				FileHandler.copy(source,destination);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		ITestListener.super.onTestFailure(result);
	}

}
