package jenkinpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Test1 {
	
	@Test
	public void TestA()
	{
	
		
		//System.setProperty("webdriver.gecko.driver","C:/JenkinsWorkSpace/Jenkin/exe/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.close();
				
	
	}
}
