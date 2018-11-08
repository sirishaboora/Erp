package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import env.BaseTest;

public class Employee implements BaseTest
{
	public WebDriver driver;
	@FindBy(xpath="//*[@class='btn btn-primary m-t-15 waves-effect associatesave']")
	public WebElement addEmployee;
	
	public Employee(WebDriver x)
	{
		this.driver=x;
		PageFactory.initElements(driver, this);
	}
	

	
}
