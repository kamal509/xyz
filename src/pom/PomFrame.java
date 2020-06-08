package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import facebookdesign.Autoconstant;
import facebookdesign.BasePage;
import facebookdesign.ExcelLibrary;

public class PomFrame extends BasePage implements Autoconstant
{
	@FindBy(xpath ="//input[@name='firstname']")
	private WebElement firstname;		
	
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement enteremail;
	
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement enterpassword;
	
	@FindBy(xpath="//select[@aria-label='Day']")
	private WebElement day;
	
	@FindBy(xpath="//select[@aria-label='Month']")
	private WebElement month;
	
	
	@FindBy(xpath="//select[@aria-label='Year']")
	private WebElement year;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement gender;

	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement signup;
	
	public PomFrame(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void submit() throws IOException
	{

		firstname.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 0));
		lastname.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 1));
		enteremail.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 2));
		enterpassword.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 3));
		selectbyvisibletext(day, "16");
		selectbyvisibletext(month, "aug");
		selectbyvisibletext(year, "1995");
		signup.click();
	}
}	
