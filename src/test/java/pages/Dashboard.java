package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import env.BaseTest;
import methods.ExplicitWaitMethods;

public class Dashboard implements BaseTest 
{
	public WebDriver driver;
	
	@FindBy(xpath="//*[@class='panel panel-success panel-colorful']")
	public WebElement associateCener;
	
	@FindBy(xpath="//*[@class='panel panel-info panel-colorful']")
	public WebElement vendorCenter;
	
	@FindBy(xpath="//*[@class='panel panel-purple panel-colorful']")
	public WebElement donorCustomerCenter;
	
	
	@FindBy(xpath="//*[@class='panel panel-warning panel-colorful']")
	public WebElement bankCenter;
	
	@FindBy(xpath="//*[@class='panel panel-org panel-colorful']")
	public WebElement organizationCenter;
	
	@FindBy(xpath="//*[@class='panel panel-cent panel-colorful']")
	public WebElement reportsCenter;
	
	public Dashboard(WebDriver x)
	{
		this.driver=x;
		PageFactory.initElements(driver, this);
	}
	
	public void clickAssociateCenter()
	{
		ExplicitWaitMethods.waitForVisibility(associateCener);
		clickObj.click(associateCener);
	}
	
	public void clickVendorCenter()
	{
		ExplicitWaitMethods.waitForVisibility(vendorCenter);
		clickObj.click(vendorCenter);
	}
	
	public void clickDonorCustomerCenter()
	{
		ExplicitWaitMethods.waitForVisibility(donorCustomerCenter);
		clickObj.click(donorCustomerCenter);
	}
	
	public void clickBankCenter()
	{
		ExplicitWaitMethods.waitForVisibility(bankCenter);
		clickObj.click(bankCenter);
	}
	
	public void clickOrganizationCenter()
	{
		ExplicitWaitMethods.waitForVisibility(organizationCenter);
		clickObj.click(organizationCenter);
	}
	
	public void clickReportsCenter()
	{
		ExplicitWaitMethods.waitForVisibility(reportsCenter);
		clickObj.click(reportsCenter);
	}
}
