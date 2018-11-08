package pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import env.BaseTest;
import methods.ExplicitWaitMethods;

public class Employee implements BaseTest
{
	public WebDriver driver;
	@FindBy(xpath="//*[@class='btn btn-primary m-t-15 waves-effect associatesave']")
	public WebElement addEmployee;
	
	@FindBy(xpath="//tbody")
	public List<WebElement> tbody;
	
	@FindBy(xpath="(//*[@id='fullname'])[3]")
	public WebElement employeeName;
	
	@FindBy(xpath="(//*[@id='emptype'])[1]")
	public WebElement employeeType;
	
	@FindBy(xpath="(//*[@id='designation'])[1]")
	public WebElement designation;
	
	@FindBy(xpath="(//*[@id='dob'])[1]")
	public WebElement dateOfBirth;
	
	
	
	
	
	public Employee(WebDriver x)
	{
		this.driver=x;
		PageFactory.initElements(driver, this);
	}
	
	public void getEmployeeName()
	{
		
		List<WebElement> x=tbody.get(0).findElements(By.xpath("//tr"));
		List<WebElement> y=x.get(0).findElements(By.xpath("//td"));
		String z=y.get(3).getText();
		System.out.println(z);
		
	}
	
	public void fillEmployeeName(String x)
	{
		ExplicitWaitMethods.waitForVisibility(employeeName);
		inputObj.enterText(employeeName, x);
	}
	
	public void selectEmployeeType(String x)
	{
		inputObj.selectOptionFromDropdownByIndex(employeeType, 1);
	}
	
	public void enterDOB(String x)
	{
		inputObj.enterText(dateOfBirth, x);
	}
	

	
}
