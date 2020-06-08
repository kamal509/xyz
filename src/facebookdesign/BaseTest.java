package facebookdesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest implements Autoconstant
{
	public WebDriver driver;
	
	@BeforeSuite
	public void openbrowser()
	{
		System.setProperty(chrome_key, chrome_value);
		driver =new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	@AfterSuite
	public void closebrowser()
	{
		driver.close();
	}

}
