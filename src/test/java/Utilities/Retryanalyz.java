package Utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retryanalyz implements IRetryAnalyzer{
 int a = 2;
 int b = 0;

	@Override
	
	public boolean retry(ITestResult result) {
		if(b<a) {
			b++;
			return true;
			
		}
		return false;
	}

}
