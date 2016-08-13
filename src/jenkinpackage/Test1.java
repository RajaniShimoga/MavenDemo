package jenkinpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class Test1 {
	
	ExtentReports c = new ExtentReports("./Result/ExtentReport.html");
	@Test
	public void TestA()
	{
	
	
	ExtentTest t = c.startTest("t1");
	t.log(LogStatus.PASS, "Hi");
		//System.setProperty("webdriver.gecko.driver","C:/JenkinsWorkSpace/Jenkin/exe/geckodriver.exe");
     WebDriver driver = new FirefoxDriver();
	 driver.get("https://www.google.co.in/");
     driver.close();
				
	c.endTest(t);
	//c.flush(); // This will write into result window 
	}
	
	@Test
	public void TestB()
	{
	
	//ExtentReports c = new ExtentReports("./Result/ExtentReport.html");
	ExtentTest t = c.startTest("t2");
	t.log(LogStatus.FAIL, "fail");
		//System.setProperty("webdriver.gecko.driver","C:/JenkinsWorkSpace/Jenkin/exe/geckodriver.exe");
     WebDriver driver = new FirefoxDriver();
	 driver.get("https://www.google.co.in/");
     driver.close();
				
	c.endTest(t);
	c.flush(); // This will write into result window 
	}
	
	
	
}
